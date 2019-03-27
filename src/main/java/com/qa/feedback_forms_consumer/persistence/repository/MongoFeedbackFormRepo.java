package com.qa.feedback_forms_consumer.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.GatewayAPI.persistence.domain.FeedbackForm;

@Repository
public interface MongoFeedbackFormRepo extends MongoRepository<FeedbackForm, Long> {
	
	FeedbackForm findTopByOrderByFeedbackIDDesc();


}
