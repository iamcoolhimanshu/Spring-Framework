package com.Udemy.spring_framework.SpringIOCcontainer;

public class Cycle implements Vehicle {
	@Override
	public void move() {
		System.out.println("Cycle is moving");
	}
}
