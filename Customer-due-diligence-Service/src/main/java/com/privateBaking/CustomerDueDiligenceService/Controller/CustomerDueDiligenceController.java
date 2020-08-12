package com.privateBaking.CustomerDueDiligenceService.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.privateBaking.CustomerDueDiligenceService.Model.CustomerDueDiligence;
import com.privateBaking.CustomerDueDiligenceService.Repository.CustomerDueDiligenceRepository;

@RestController
public class CustomerDueDiligenceController {
	//private static final Logger logger = Logger.getLogger(CustomerDueDiligenceController.class);
	
	@Autowired
	CustomerDueDiligenceRepository customerDueDiligenceRepository;
	
	//@Autowired
	CustomerDueDiligence customerDueDiligence;
	

	@GetMapping("customer/{customerId}/getStatus")
	public CustomerDueDiligence getDiligenceStatus(@PathVariable  Long customerId) {
		Optional<CustomerDueDiligence> diligenceOptional = customerDueDiligenceRepository.findById(customerId);
		CustomerDueDiligence diligence = diligenceOptional.get();
		return diligence;
	}

}

