package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootRestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestProjectApplication.class, args);
	}

}
