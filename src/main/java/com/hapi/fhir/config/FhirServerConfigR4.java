package com.hapi.fhir.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
	StarterConfig.class
})
public class FhirServerConfigR4 {
}
