package com.qa.feedback_forms_consumer.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.gateway.persistence.domain.Cohort;

@Repository
public interface MongoCohortRepo extends MongoRepository<Cohort, Long>{
	
	Cohort findTopByOrderByCohortIDDesc();


}
