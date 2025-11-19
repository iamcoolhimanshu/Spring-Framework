package com.Udemy.spring_framework.SpringIOCcontainer;

public class Traveler {
	private Vehicle vehicle;

	public Traveler(Vehicle vehicle) {
		this.vehicle=vehicle;
	}

	public void startJourney() {
		this.vehicle.move();
	}
}
