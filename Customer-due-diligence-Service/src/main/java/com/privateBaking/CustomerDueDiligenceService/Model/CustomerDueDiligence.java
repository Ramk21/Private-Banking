package com.privateBaking.CustomerDueDiligenceService.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Due_Diligence")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Component
public class CustomerDueDiligence {
	@Id	
	@Column(name = "customer_id")
	Long customerId;
	@Column(name = "status")
	   String diligenceStatus;  
	
}
