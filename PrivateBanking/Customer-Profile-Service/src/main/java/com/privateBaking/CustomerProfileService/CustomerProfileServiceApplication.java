package com.privateBaking.CustomerProfileService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient	
public class CustomerProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerProfileServiceApplication.class, args);
	}

}
