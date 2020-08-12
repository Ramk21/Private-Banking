package com.privateBaking.CustomerDueDiligenceService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.privateBaking.CustomerDueDiligenceService.Model.CustomerDueDiligence;

@Repository
public interface CustomerDueDiligenceRepository extends JpaRepository<CustomerDueDiligence, Long>{

}
