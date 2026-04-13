package com.hapi.fhir.controller;

import org.hl7.fhir.r4.model.IdType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.hapi.fhir.service.ResourceService;

import ca.uhn.fhir.rest.server.RestfulServer;

@RestController
public class FHIRController extends RestfulServer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	ResourceService resourceService;
	
	@GetMapping("/")
	public String test() {
		return "Hello World!";
	}

	@GetMapping(path = "/Patient/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getPatient(@PathVariable("id") String id) {
		if (id == null) {
			return null;
		}
		IdType thisId = new IdType(id);
		String result = resourceService.getPatient(thisId);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(path = "/Practitioner/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getPractitioner(@PathVariable("id") String id){
		if (id == null) {
			return null;
		}
		IdType thisId = new IdType(id);
		String result = resourceService.getPractitioner(thisId);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(path = "/Appointment/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getAppointment(@PathVariable("id") String id){
		if (id == null) {
			return null;
		}
		IdType thisId = new IdType(id);
		String result = resourceService.getAppointment(thisId);
		return ResponseEntity.ok(result);
	}

}
