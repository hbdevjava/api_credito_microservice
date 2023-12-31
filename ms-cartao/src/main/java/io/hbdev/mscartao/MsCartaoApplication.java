package io.hbdev.mscartao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsCartaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCartaoApplication.class, args);
	}

}
