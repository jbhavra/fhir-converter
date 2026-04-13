package com.hapi.fhir.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ca.uhn.fhir.rest.server.RestfulServer;
import ca.uhn.fhir.rest.server.interceptor.ResponseHighlighterInterceptor;
import ca.uhn.fhir.rest.server.interceptor.ResponseValidatingInterceptor;
import ca.uhn.fhir.validation.ResultSeverityEnum;

@Configuration
public class StarterConfig {

    @Bean
    RestfulServer restfulServer() {
        RestfulServer fhirServer = new RestfulServer();

        ResponseValidatingInterceptor interceptor = new ResponseValidatingInterceptor();
        interceptor.setFailOnSeverity(ResultSeverityEnum.ERROR);
        fhirServer.registerInterceptor(interceptor);
        fhirServer.registerInterceptor(new ResponseValidatingInterceptor());
        fhirServer.registerInterceptor(new ResponseHighlighterInterceptor());

        return fhirServer;
    }

}
