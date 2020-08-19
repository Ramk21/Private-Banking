package com.privateBaking.CustomerProfileService;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.privateBaking.CustomerProfileService.Controller.CustomerProfileController;
import com.privateBaking.CustomerProfileService.Model.CustomerStatus;
import com.privateBaking.CustomerProfileService.Model.DiligenceService;

@RunWith(MockitoJUnitRunner.class)
class CustomerProfileServiceApplicationTests {

	@Mock
	DiligenceService diligenceService;
	
    @InjectMocks
    CustomerProfileController CustomerProfileController;
    
    @Test
    public void testGetDiligenceStatus() {
    	Long Id=3L;
    	CustomerStatus  customerStatus=diligenceService.getStatusDetails(Id);
    	assertEquals("approved",customerStatus.getDiligenceStatus());
    }

}
