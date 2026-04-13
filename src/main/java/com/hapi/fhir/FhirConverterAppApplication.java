package com.hapi.fhir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import ca.uhn.fhir.rest.server.RestfulServer;

//@ServletComponentScan(basePackageClasses = { RestfulServer.class })
@SpringBootApplication
public class FhirConverterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FhirConverterAppApplication.class, args);
	}

	/*
	 * @Autowired AutowireCapableBeanFactory beanFactory;
	 * 
	 * @SuppressWarnings("rawtypes")
	 * 
	 * @Bean public ServletRegistrationBean servletRegistration(RestfulServer
	 * restfulServer) { ServletRegistrationBean servletRegistrationBean = new
	 * ServletRegistrationBean(); beanFactory.autowireBean(restfulServer);
	 * servletRegistrationBean.setServlet(restfulServer);
	 * servletRegistrationBean.addUrlMappings("/*");
	 * servletRegistrationBean.setLoadOnStartup(1);
	 * 
	 * return servletRegistrationBean; }
	 */

}
