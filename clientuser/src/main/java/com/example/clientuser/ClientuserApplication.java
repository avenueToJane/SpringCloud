package com.example.clientuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientuserApplication.class, args);
	}

}

