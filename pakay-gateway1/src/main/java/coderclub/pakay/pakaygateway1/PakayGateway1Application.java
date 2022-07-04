package coderclub.pakay.pakaygateway1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PakayGateway1Application {

	public static void main(String[] args) {
		SpringApplication.run(PakayGateway1Application.class, args);
	}

}
