package com.privateBaking.CustomerDueDiligenceService.Controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
//	@HystrixCommand(fallbackMethod="fallBackMethod" )
	@GetMapping("customer/{customerId}/getStatus")
	public CustomerDueDiligence getDiligenceStatus(@PathVariable  Long customerId) {
		CustomerDueDiligence diligence = new CustomerDueDiligence();
//		try {
		logger.info("CustomerDueDiligence calling get method...");
		Optional<CustomerDueDiligence> diligenceOptional = customerDueDiligenceRepository.findById(customerId);
		 if(diligenceOptional.isPresent()) { 
		     diligence = diligenceOptional.get();		
			 diligence.setCustomerId(customerId);
			 diligence.setDiligenceStatus("default");
			 customerDueDiligenceRepository.saveAndFlush(diligence);
				return diligence;
		 }
		 else {
			// diligence = diligenceOptional.get();
			 diligence.setCustomerId(customerId);
			 diligence.setDiligenceStatus("pending");
			 customerDueDiligenceRepository.saveAndFlush(diligence);
				return diligence;
		 }
		
//		}catch(Exception e) {
//			logger.info("error in CustomerDueDiligence calling get method...");
			//getCustomerStatusWithFaultTolerance();
//		}
//		return diligence;
	}
	
	@HystrixCommand(fallbackMethod="fallBackMethod" )
	  @GetMapping("customer/{customerId}/getDiligenceDetails") public
	  CustomerDueDiligence getDiligenceDetails(@PathVariable Long customerId) {
	  CustomerDueDiligence diligence = new CustomerDueDiligence();
	  logger.info("CustomerDueDiligence calling get method...");
		Optional<CustomerDueDiligence> diligenceOptional = customerDueDiligenceRepository.findById(customerId);
		// if(diligenceOptional.isPresent()) { 
		     diligence = diligenceOptional.get();		
			// diligence.setCustomerId(customerId);
			// diligence.setDiligenceStatus("default");
		// }
	  return diligence;
	  }
	 
		/*
		 * @GetMapping(value="/customer/fault-tolerance")
		 * 
		 * @HystrixCommand(fallbackMethod="fallBackMethod") public CustomerDueDiligence
		 * getCustomerStatusWithFaultTolerance() { throw new
		 * RuntimeException("issue happened"); }
		 */
	
	public CustomerDueDiligence fallBackMethod(Long id) {	
		logger.info("fallBackMethod values..."+customerConfiguration.getDefaultCustomerId()
		+"...."+customerConfiguration.getDefaultDiligenceStatus());
		return new CustomerDueDiligence
	(customerConfiguration.getDefaultCustomerId(),customerConfiguration.getDefaultDiligenceStatus()) ;
	}

}

