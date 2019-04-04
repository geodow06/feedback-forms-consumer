package com.qa.feedback_forms_consumer.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.feedback_forms_consumer.persistence.repository.MongoCohortRepo;
import com.qa.gateway.persistence.domain.Cohort;

@Component
public class CohortReceiver {
	
    @Autowired
    private MongoCohortRepo repo;
    
    @JmsListener(destination = "CohortQueue", containerFactory = "myFactory")
    public void receiveMessage(Cohort cohort) {
    	
		if (repo.count() < 1) {
			cohort.setCohortID( 1L);
		} else {
			cohort.setCohortID(repo.findTopByOrderByCohortIDDesc().getCohortID() + 1);
		}
		repo.save(cohort);
	}

}
