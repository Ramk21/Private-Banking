package com.privateBaking.CustomerDueDiligenceService.Controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.privateBaking.CustomerDueDiligenceService.Model.CustomerConfiguration;
import com.privateBaking.CustomerDueDiligenceService.Model.CustomerDueDiligence;
import com.privateBaking.CustomerDueDiligenceService.Repository.CustomerDueDiligenceRepository;
//import com.privateBaking.CustomerProfileService.Controller.CustomerProfileController;

@RestController
@EnableHystrix
public class CustomerDueDiligenceController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerDueDiligenceController.class);
	
	@Autowired
	CustomerDueDiligenceRepository customerDueDiligenceRepository;
	
	@Autowired
	CustomerConfiguration customerConfiguration;
	
	CustomerDueDiligence customerDueDiligence;
	

	@GetMapping("customer/{customerId}/getStatus")
	public CustomerDueDiligence getDiligenceStatus(@PathVariable  Long customerId) {
		logger.info("CustomerDueDiligence calling get method...");
		Optional<CustomerDueDiligence> diligenceOptional = customerDueDiligenceRepository.findById(customerId);
		CustomerDueDiligence diligence = diligenceOptional.get();
		return diligence;
	}
	
	
	@GetMapping(value="/customer/fault-tolerance")	
	@HystrixCommand(fallbackMethod="fallBackMethod")
	public CustomerDueDiligence getCustomerStatusWithFaultTolerance() {
		throw new RuntimeException("issue happened");
	}
	
	public CustomerDueDiligence fallBackMethod() {
		//return new Employee(444,"Ram","Kumar",null);
//		return new CustomerDueDiligence(444,employeeConfiguration.getDefaultFirstName(),
//				employeeConfiguration.getDefaultLastName(),null);
		logger.info("fallBackMethod values..."+customerConfiguration.getDefaultCustomerId()
		+"...."+customerConfiguration.getDefaultDiligenceStatus());
		return new CustomerDueDiligence
	(customerConfiguration.getDefaultCustomerId(),customerConfiguration.getDefaultDiligenceStatus()) ;
	}

}

