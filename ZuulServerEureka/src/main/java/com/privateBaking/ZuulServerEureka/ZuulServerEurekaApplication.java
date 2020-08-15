package com.privateBaking.ZuulServerEureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//import com.privateBaking.CustomerDueDiligenceService.Controller.CustomerDueDiligenceController;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulServerEurekaApplication {
	private static final Logger logger = LoggerFactory.getLogger(ZuulServerEurekaApplication.class);
	public static void main(String[] args) {
		logger.info("sleuth calling ZuulServerEurekaApplication.......");
		SpringApplication.run(ZuulServerEurekaApplication.class, args);
	}

}
