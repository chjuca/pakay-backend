package coderclub.pakay.pakayregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class PakayRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PakayRegistryApplication.class, args);
	}

}
