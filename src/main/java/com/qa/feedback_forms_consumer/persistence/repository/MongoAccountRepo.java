package com.qa.feedback_forms_consumer.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.gateway.persistence.domain.Account;

@Repository
public interface MongoAccountRepo  extends MongoRepository<Account, Long>{
	
	Account findTopByOrderByAccountIDDesc();
	
}
