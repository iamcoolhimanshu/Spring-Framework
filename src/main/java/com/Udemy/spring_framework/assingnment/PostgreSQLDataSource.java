package com.Udemy.spring_framework.assingnment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class PostgreSQLDataSource implements DataSource {

	@Override
	public String[] getEmails() {
		String[] emails = { "ramesh@gamil.com", "anshu@gmail.com", "anish@gamil.com" };
		return emails;
	}

}
