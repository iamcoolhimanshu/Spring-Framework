package com.Udemy.spring_framework.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Student {
	private Address address;

	public Student(Address address) {
		this.address = address;
	}

	public void print() {
		System.out.println("Student class method callled...");
		address.print();
	}

	public void init() {
		System.out.println("initialization logic");
	}

	public void destroy() {
		System.out.println("destruction logic");
	}
}

class Address {
	public void print() {
		System.out.println("Address class method callled...");
	}
}

@Configuration
class AppConfig {
	@Bean(name = "addressBean")
	public Address address() {
		return new Address();
	}

	@Bean(name = "studentBean", initMethod = "init", destroyMethod = "destroy")
	public Student student() {
		return new Student(address());
	}
}

public class BeanAnnotationDemo {
	public static void main(String[] args) {

		try (var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)) {

			Student student = applicationContext.getBean(Student.class);
			String[] beanNames = applicationContext.getBeanDefinitionNames();
			for (String bean : beanNames) {
				System.out.println(bean);
			}
			student.print();
		}

	}
}
