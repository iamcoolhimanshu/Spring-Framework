package com.Udemy.spring_framework.SpringIOCcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		Vehicle vehicle=new Car();
		
		Traveler traveler=new Traveler(vehicle);
		traveler.startJourney();
		
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(AppConfig.class);

	Car car=applicationContext.getBean(Car.class);
	car.move();
	
	Bike bike=applicationContext.getBean(Bike.class);
	bike.move();
	Traveler traveler1=applicationContext.getBean(Traveler.class);
  	traveler.startJourney();
	}
}
