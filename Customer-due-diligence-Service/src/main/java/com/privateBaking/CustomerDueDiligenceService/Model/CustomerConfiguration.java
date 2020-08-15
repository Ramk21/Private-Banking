package com.privateBaking.CustomerDueDiligenceService.Model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ConfigurationProperties(prefix="diligence-service")
@Component
public class CustomerConfiguration {
	private Long defaultCustomerId;
	
	 private  String defaultDiligenceStatus; 
}


