package com.privateBaking.CustomerProfileService.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Customer_Info")
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Component
public class CustomerProfile {
	@Id	
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Customer_Info_seq")
	@SequenceGenerator(name="Customer_Info_seq",sequenceName="Customer_Info_seq",initialValue=1,allocationSize=1)
	@Column(name = "customer_id")
	Long customerId;
	@Column(name = "customer_name")
	   String name;  
	@Column(name = "customer_email")
	   String email;  
	@Column(name = "mobile_No")
	   Long mobileNo;	
	@Column(name = "user_Name")
	  String userName; 
	@Column(name = "password")
	  String passwrd;
	@Column(name = "customer_address")
	  String address; 
	@Column(name = "state_name")
	  String state;  
	@Column(name = "customer_country")
	  String country;
	@Column(name = "pan_no")
	  String panNo; 
	@Column(name = "date_of_birth")
	  Date dob; 
	@Column(name = "account_no")
	  Long accountNo;
	
	
}
