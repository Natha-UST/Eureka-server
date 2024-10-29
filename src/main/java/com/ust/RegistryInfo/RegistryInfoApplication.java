package com.ust.RegistryInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryInfoApplication.class, args);
	}

}
