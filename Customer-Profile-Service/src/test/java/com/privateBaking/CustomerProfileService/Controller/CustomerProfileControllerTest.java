package com.privateBaking.CustomerProfileService.Controller;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.when;
//import static org.mockito.Mockito.
import org.mockito.junit.MockitoJUnitRunner;

import com.privateBaking.CustomerProfileService.Model.CustomerStatus;
import com.privateBaking.CustomerProfileService.Model.DiligenceService;

@RunWith(MockitoJUnitRunner.class)
public class CustomerProfileControllerTest {

	@Mock
	DiligenceService diligenceService;
	
    @InjectMocks
    CustomerProfileController CustomerProfileController;
    
	/*
	 * @Test public void testGetDiligenceStatus() { Long Id=3L;
	 * when(diligenceService.getStatusDetails(Id)).thenReturn(customerStatus)
	 * CustomerStatus customerStatus=diligenceService.getStatusDetails(Id);
	 * assertEquals("approved",customerStatus.getDiligenceStatus()); }
	 * 
	 * public CustomerProfileControllerTest() { }
	 */

}
