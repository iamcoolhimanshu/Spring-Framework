package com.Udemy.spring_framework.assingnment;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource {

	@Override
	public String[] getEmails() {
		String[] emails = { "ramesh@gamil.com", "anshu@gmail.com", "anish@gamil.com" };
		return emails;
	}

}
