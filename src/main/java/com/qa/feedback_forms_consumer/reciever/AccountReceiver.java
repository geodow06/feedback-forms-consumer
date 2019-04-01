package com.qa.feedback_forms_consumer.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.feedback_forms_consumer.persistence.repository.MongoAccountRepo;
import com.qa.gateway.persistence.domain.Account;

@Component
public class AccountReceiver {
	
	@Autowired
	private MongoAccountRepo repo;

	@JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
	public void receiveMessage(Account account) {

		if (repo.count() < 1) {
			account.setAccountID(1L);
		} else {
			account.setAccountID(repo.findTopByOrderByAccountIDDesc().getAccountID() + 1);
		}
		repo.save(account);
	}

}
