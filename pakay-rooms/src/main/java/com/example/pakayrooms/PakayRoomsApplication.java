package com.example.pakayrooms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PakayRoomsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PakayRoomsApplication.class, args);
	}

}
