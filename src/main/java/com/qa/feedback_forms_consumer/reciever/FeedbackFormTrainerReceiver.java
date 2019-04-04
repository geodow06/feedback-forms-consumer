package com.qa.feedback_forms_consumer.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.feedback_forms_consumer.persistence.repository.MongoFeedbackFormTrainerRepo;
import com.qa.gateway.persistence.domain.FeedbackFormTrainer;

@Component
public class FeedbackFormTrainerReceiver {

    @Autowired
    private MongoFeedbackFormTrainerRepo repo;

    @JmsListener(destination = "TrainerForms", containerFactory = "myFactory")
    public void receiveMessage(FeedbackFormTrainer feedbackForm) {
    	
		if (repo.count() < 1) {
			feedbackForm.setTrainerFormID(1L);
		} else {
			feedbackForm.setTrainerFormID(repo.findTopByOrderByTrainerFormIDDesc().getTrainerFormID() + 1);
		}
		repo.save(feedbackForm);
	}
}