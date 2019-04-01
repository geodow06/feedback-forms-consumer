package com.qa.feedback_forms_consumer.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.gateway.persistence.domain.FeedbackFormTrainee;

@Repository
public interface MongoFeedbackFormTraineeRepo extends MongoRepository<FeedbackFormTrainee, Long> {
	
	FeedbackFormTrainee findTopByOrderByTraineeFormIDDesc();


}
