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
	
/*	@PostMapping("customer/{customerName}/{userName}/saveInfo")
	public void saveCustomerInfo(
			@PathVariable  String customerName, @RequestParam  String email, @RequestParam  Long mobileNo,	
			@PathVariable String userName, @RequestParam String password,
			@RequestParam String address, @RequestParam String state, @RequestParam String country,
			@RequestParam String panNo,@RequestParam Date dob,@RequestParam Long accountNo)
			 {
		customerProfile= new CustomerProfile();
		customerProfile.setName(customerName);
		customerProfile.setEmail(email);
		customerProfile.setMobileNo(mobileNo);
		customerProfile.setUserName(userName);
		customerProfile.setPasswrd(password);
		customerProfile.setAddress(address);
		customerProfile.setState(state);
		customerProfile.setCountry(country);
		customerProfile.setPanNo(panNo);
		customerProfile.setDob(dob);
		customerProfile.setAccountNo(accountNo);
		customerProfileRepository.save(customerProfile);		
	}*/
	
	@GetMapping("customer/{customerId}/getStatus")
	public CustomerDueDiligence getDiligenceStatus(@PathVariable  Long customerId) {
		Optional<CustomerDueDiligence> diligenceOptional = customerDueDiligenceRepository.findById(customerId);
		CustomerDueDiligence diligence = diligenceOptional.get();
		return diligence;
	}

}

