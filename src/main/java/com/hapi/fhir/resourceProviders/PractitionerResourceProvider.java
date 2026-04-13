package com.hapi.fhir.resourceProviders;

import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Practitioner;
import org.springframework.stereotype.Component;

import com.hapi.fhir.legacy.models.LegacyDoctorMaster;

import ca.uhn.fhir.rest.annotation.IdParam;
import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.server.IResourceProvider;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;

@Component
public class PractitionerResourceProvider implements IResourceProvider{

	@Override
	public Class<? extends IBaseResource> getResourceType() {
		return Practitioner.class;
	}
	
	@Read
	public Practitioner read(@IdParam IdType thisId) {
		try {
			
			LegacyDoctorMaster lDoc = LegacyDoctorMaster.getDefaultDoctor();
			
			Practitioner prac = new Practitioner();
			prac.setId(lDoc.getDoctorId());
			if(lDoc.getIsActive() == "active") prac.setActive(true);
			prac.addName().setText(lDoc.getDoctorName());
			
			return prac;
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			throw new ResourceNotFoundException(thisId);
		}
	}

}
