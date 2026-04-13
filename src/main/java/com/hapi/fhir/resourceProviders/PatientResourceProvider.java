package com.hapi.fhir.resourceProviders;

import java.text.SimpleDateFormat;
import java.util.Locale;

import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.r4.model.Address.AddressType;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem;
import org.hl7.fhir.r4.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.stereotype.Component;

import com.hapi.fhir.legacy.models.LegacyPatient;

import ca.uhn.fhir.rest.annotation.IdParam;
import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.server.IResourceProvider;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;

@Component
public class PatientResourceProvider implements IResourceProvider {

	@Override
	public Class<? extends IBaseResource> getResourceType() {
		return Patient.class;
	}

	@Read()
	public Patient read(@IdParam IdType theId) {
		try {
			
			LegacyPatient lp = LegacyPatient.getDefaultPatient();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
			
			Patient pat1 = new Patient();
			pat1.setId(lp.getPatientId());
			pat1.addIdentifier().setSystem("http://acme.com/MRNs").setValue("7000135");
			pat1.addName().setFamily(lp.getLastName()).addGiven(lp.getFirstName()).addGiven(lp.getMiddleName()).addPrefix(lp.getSalutation()).setText(lp.getDisplayName());
			pat1.addAddress().setType(AddressType.POSTAL).setCountry(lp.getNationality()).setState(lp.getState()).setText(lp.getAddress());
			pat1.setGender(AdministrativeGender.MALE);
			pat1.setBirthDate(formatter.parse(lp.getDob()));
			pat1.addCommunication().setLanguage(new CodeableConcept().setText(lp.getLanguagePreferance())).setPreferred(true);
			pat1.addTelecom().setSystem(ContactPointSystem.PHONE).setValue(lp.getMobile()).setSystem(ContactPointSystem.EMAIL).setValue(lp.getEmail());
			pat1.setMaritalStatus(new CodeableConcept().setText(lp.getMaritalStatus()));
			return pat1;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			throw new ResourceNotFoundException(theId);
		}
	}

}
