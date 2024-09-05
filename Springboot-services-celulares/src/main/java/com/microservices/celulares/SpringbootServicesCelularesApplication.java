package com.microservices.celulares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootServicesCelularesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicesCelularesApplication.class, args);
	}

}
