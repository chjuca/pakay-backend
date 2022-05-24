package com.example.pakaygateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PakayGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PakayGatewayApplication.class, args);
	}

}
