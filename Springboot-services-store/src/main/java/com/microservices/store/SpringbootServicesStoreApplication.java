package com.microservices.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringbootServicesStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicesStoreApplication.class, args);
	}

}
