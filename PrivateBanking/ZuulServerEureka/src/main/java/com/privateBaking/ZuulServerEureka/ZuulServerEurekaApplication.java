package com.privateBaking.ZuulServerEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerEurekaApplication.class, args);
	}

}
