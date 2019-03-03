package com.javatechdeveloper.mhss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MhssApplication {

	public static void main(String[] args) {
		SpringApplication.run(MhssApplication.class, args);
	}

}
