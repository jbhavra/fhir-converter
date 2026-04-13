package com.hapi.fhir.resourceProviders;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.r4.model.Appointment;
import org.hl7.fhir.r4.model.Appointment.AppointmentStatus;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Practitioner;
import org.hl7.fhir.r4.model.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hapi.fhir.legacy.models.LegacyAppointment;

import ca.uhn.fhir.rest.annotation.IdParam;
import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.server.IResourceProvider;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;

@Component
public class AppointmentResourceProvider implements IResourceProvider{
	
	@Autowired
	PatientResourceProvider prp;
	
	@Autowired
	PractitionerResourceProvider prac;

	@Override
	public Class<? extends IBaseResource> getResourceType() {
		return Appointment.class;
	}
	
	@Read
	public Appointment read(@IdParam IdType theId) {
		try {
			LegacyAppointment la = LegacyAppointment.getDefaultAppointment();
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH);
			
			Appointment apt = new Appointment();
			apt.setId(la.getAppointmentId());
			apt.setStatus(AppointmentStatus.FULFILLED);
			apt.addReasonCode().setText(la.getReason());
			apt.setStart(formatter.parse(la.getStartTime()));
			apt.setEnd(formatter.parse(la.getEndTime()));
			apt.setAppointmentType(new CodeableConcept().setText(la.getType()));
			apt.setCreated(formatter.parse(la.getCreationDate()));
			
			long diffInMillies = Math.abs(formatter.parse(la.getEndTime()).getTime() - formatter.parse(la.getStartTime()).getTime());
		    long diff = TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS);
			
		    apt.setMinutesDuration((int)diff);
		    apt.setDescription(la.getServicesBooked());
		    
		    // get Doctor
		    Practitioner prac1 = prac.read(theId);
		    
		    // get Patient
		    Patient p1 = prp.read(theId);
		    
		    apt.addParticipant().setActor(new Reference(prac1));
		    apt.addParticipant().setActor(new Reference(p1));
			
			return apt;
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			throw new ResourceNotFoundException(theId);
		}
	}

}
