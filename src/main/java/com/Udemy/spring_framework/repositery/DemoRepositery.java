package com.Udemy.spring_framework.repositery;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepositery {
	public String hello() {
		return "hello World";
	}
}
