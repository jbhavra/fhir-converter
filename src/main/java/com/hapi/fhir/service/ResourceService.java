package com.hapi.fhir.service;

import org.hl7.fhir.instance.model.api.IAnyResource;
import org.hl7.fhir.r4.model.Appointment;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Practitioner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hapi.fhir.resourceProviders.AppointmentResourceProvider;
import com.hapi.fhir.resourceProviders.PatientResourceProvider;
import com.hapi.fhir.resourceProviders.PractitionerResourceProvider;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;

@Component
public class ResourceService {

	@Autowired
	PatientResourceProvider prp;
	
	@Autowired
	PractitionerResourceProvider pracrp;
	
	@Autowired
	AppointmentResourceProvider arp;
	
	FhirContext ctx = FhirContext.forR4();
	
	public String getPatient(IdType id) {
		Patient patient = prp.read(id);
		
		return resourceParser(patient);
		/*
		 * IParser parser = ctx.newJsonParser(); String serialized =
		 * parser.encodeResourceToString(patient); return serialized;
		 */
	}
	
	public String getPractitioner(IdType id) {
		Practitioner prac = pracrp.read(id);
		return resourceParser(prac);
	}
	
	public String getAppointment(IdType id) {
		Appointment apt = arp.read(id);
		return resourceParser(apt);
	}
	
	private String resourceParser(IAnyResource resource) {
		IParser parser = ctx.newJsonParser();
		String serialized = parser.encodeResourceToString(resource);
		return serialized;
	}
}
