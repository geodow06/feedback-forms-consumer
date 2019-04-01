package com.qa.feedback_forms_consumer.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.feedback_forms_consumer.persistence.repository.MongoFeedbackFormTraineeRepo;
import com.qa.gateway.persistence.domain.FeedbackFormTrainee;

@Component
public class FeedbackFormTraineeReceiver {

    @Autowired
    private MongoFeedbackFormTraineeRepo repo;

    @JmsListener(destination = "TraineeForms", containerFactory = "myFactory")
    public void receiveMessage(FeedbackFormTrainee feedbackForm) {
    	
		if (repo.count() < 1) {
			feedbackForm.setTraineeFormID(1L);
		} else {
			feedbackForm.setTraineeFormID(repo.findTopByOrderByTraineeFormIDDesc().getTraineeFormID() + 1);
		}
		repo.save(feedbackForm);
	}
}