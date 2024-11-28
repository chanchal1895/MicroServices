package com.chanchal.EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EsdurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsdurekaServerApplication.class, args);
	}

}
