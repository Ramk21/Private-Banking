package com.privateBaking.CustomerProfileService.Model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

//@Component
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CustomerInfoDTO {

	
	   String name;  
	
	   String email;  
	
	   Long mobileNo;	
	
	  String userName; 
	
	  String passwrd;
	
	  String address; 
	
	  String state;  
	
	  String country;
	
	  String panNo; 
	
	  Date dob; 
	
	  Long accountNo;

	  
	
}
