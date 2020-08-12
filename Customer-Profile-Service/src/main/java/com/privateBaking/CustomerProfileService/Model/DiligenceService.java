package com.privateBaking.CustomerProfileService.Model;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "edge-zuul")
@RibbonClient(name = "diligence-service")
public interface DiligenceService  {

	@GetMapping(value = "/diligence-service/customer/{customerId}/getStatus")
	public Cus getStatusDetails(@PathVariable Long customerId);
}
