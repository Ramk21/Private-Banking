package com.privateBaking.CustomerProfileService.Controller;

import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.privateBaking.CustomerProfileService.Model.CustomerInfoDTO;
import com.privateBaking.CustomerProfileService.Model.CustomerProfile;
import com.privateBaking.CustomerProfileService.Repository.CustomerProfileRepository;

@RestController
public class CustomerProfileController {
	//private static final Logger logger = Logger.getLogger(CustomerProfileController.class);
	
	@Autowired
	CustomerProfileRepository customerProfileRepository;
	
	//@Autowired
	CustomerProfile customerProfile;
	
	@PostMapping("customer/{customerName}/{userName}/saveInfo")
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
		customerProfileRepository.saveAndFlush(customerProfile);		
	}
	
	@PutMapping("customer/{customerId}/updateCustomerInfo")
	public void updateCustomerInfo(@PathVariable  Long customerId,@RequestBody  CustomerInfoDTO customerInfoDTO) {
		customerProfile= new CustomerProfile();
		Optional<CustomerProfile> customerProfileEntity = customerProfileRepository.findById(customerId);
		customerProfile= customerProfileEntity.get();
		if(!customerInfoDTO.getName().isEmpty() && customerInfoDTO.getName()!=null) {
		customerProfile.setName(customerInfoDTO.getName());
		}
		if(!customerInfoDTO.getEmail().isEmpty() && customerInfoDTO.getEmail()!=null) {
		customerProfile.setEmail(customerInfoDTO.getEmail());
		}
		if (customerInfoDTO.getMobileNo()!=null) {
		customerProfile.setMobileNo(customerInfoDTO.getMobileNo());
		}
		if(!customerInfoDTO.getUserName().isEmpty() && customerInfoDTO.getUserName()!=null) {
		customerProfile.setUserName(customerInfoDTO.getUserName());
		}
		if(!customerInfoDTO.getPasswrd().isEmpty() && customerInfoDTO.getPasswrd()!=null) {
		customerProfile.setPasswrd(customerInfoDTO.getPasswrd());
		}
		if(!customerInfoDTO.getAddress().isEmpty() && customerInfoDTO.getAddress()!=null) {
		customerProfile.setAddress(customerInfoDTO.getAddress());
		}
		if(!customerInfoDTO.getState().isEmpty() && customerInfoDTO.getState()!=null) {
		customerProfile.setState(customerInfoDTO.getState());
		}
		if(!customerInfoDTO.getCountry().isEmpty() && customerInfoDTO.getCountry()!=null) {
		customerProfile.setCountry(customerInfoDTO.getCountry());
		}
		if(!customerInfoDTO.getPanNo().isEmpty() && customerInfoDTO.getPanNo()!=null) {
		customerProfile.setPanNo(customerInfoDTO.getPanNo());
		}
		if(customerInfoDTO.getDob()!=null) {
		customerProfile.setDob(customerInfoDTO.getDob());
		}
		if (customerInfoDTO.getAccountNo()!=null) {
		customerProfile.setAccountNo(customerInfoDTO.getAccountNo());
		}
		customerProfileRepository.saveAndFlush(customerProfile);
		
		//return null;
		
	}

}

