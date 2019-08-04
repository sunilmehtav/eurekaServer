package com.neustar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSreverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSreverApplication.class, args);
	}

}
