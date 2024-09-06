package com.vidal.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class Gen9EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gen9EurekaServerApplication.class, args);

	}




}
