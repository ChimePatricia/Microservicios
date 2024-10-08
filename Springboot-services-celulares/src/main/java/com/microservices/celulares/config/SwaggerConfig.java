package com.microservices.celulares.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.apis(RequestHandlerSelectors.basePackage("com.microservices.celulares.controllers"))
					.paths(PathSelectors.any())
					.build()
					.apiInfo(getApiTnfo());
	}

	private ApiInfo getApiTnfo() {
		return new ApiInfo("Celulares",
				"Servicio para venta celulares",
				"1.0.0",
				"Terminos de servicios",
				new Contact("Ximena", "https://www.google.com", "ximena.gomez@uanl.edu.mx"),
				"LISENSE",
				"license url",
				Collections.emptyList()
				);
	}
}