package com.Udemy.spring_framework.DI;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}
}
