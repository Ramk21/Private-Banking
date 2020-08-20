
  package com.privateBaking.CustomerProfileService.Controller;
  
  
  
  import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import  org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.privateBaking.CustomerProfileService.Model.CustomerInfoDTO;
import com.privateBaking.CustomerProfileService.Model.CustomerProfile;
import  com.privateBaking.CustomerProfileService.Model.DiligenceService;
import com.privateBaking.CustomerProfileService.Repository.CustomerProfileRepository;
  
  @RunWith(MockitoJUnitRunner.class) 
  public class CustomerProfileControllerTest
  {
  
  @Mock 
  DiligenceService diligenceService;
  
  @Mock 
  CustomerProfileRepository customerProfileRepository;
  
  @InjectMocks 
  CustomerProfileController CustomerProfileController;
  
  
  @Test 
  public void testSaveCustomerInfo() { 
	  Long userId=3L;
	  CustomerProfile profile = new CustomerProfile();
	  profile.setCustomerId(3L);
	  when(customerProfileRepository.findById(any())).thenReturn(Optional.of(profile));
	  CustomerProfileController.saveCustomerInfo
	  ("arya","arya@gmail.com",9940829970L,"ar453","ar33","st","tn","uk","BBUPT5678G",
			  new Date(0),65656565L);	  
	  assertEquals(userId,profile.getCustomerId());
}
  @Test 
  public void testUpdateCustomerInfo() { 
	  CustomerProfile profile = new CustomerProfile();
	  profile.setCustomerId(3L);
	  CustomerInfoDTO customerInfoDTO = new CustomerInfoDTO();
	  customerInfoDTO.setAccountNo(2343535L);
	  customerInfoDTO.setAddress("");
	  customerInfoDTO.setCountry("India");
	  customerInfoDTO.setDob(new Date(0));
	  customerInfoDTO.setEmail(null);
	  customerInfoDTO.setMobileNo(9940829980L);
	  customerInfoDTO.setName(null);
	  customerInfoDTO.setPanNo("ERTDFG456H");
	  customerInfoDTO.setPasswrd("@#32r");
	  customerInfoDTO.setState("ACF");
	  customerInfoDTO.setUserName("Ser34");
	  when(customerProfileRepository.findById(any())).thenReturn(Optional.of(profile));
	  CustomerProfileController.updateCustomerInfo(5L, customerInfoDTO);
	  verify(customerProfileRepository,times(1)).saveAndFlush(any());
  }
  public CustomerProfileControllerTest() { }
  
  
  }
 