package com.privateBaking.CustomerProfileService.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;


	@Entity
	@Table(name = "Due_Diligence")
	@Data
	@NoArgsConstructor
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@Component
	public class  CustomerStatus {
		@Id	
		@Column(name = "customer_id")
		Long customerId;
		@Column(name = "status")
		   String diligenceStatus;  
		
	}

