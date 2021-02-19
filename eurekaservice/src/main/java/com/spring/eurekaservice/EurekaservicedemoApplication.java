package com.spring.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaservicedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaservicedemoApplication.class, args);
	}

}
