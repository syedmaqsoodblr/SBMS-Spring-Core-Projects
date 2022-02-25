package com.maq.beans;

public class Car
{

	private IEngine engine = null;
	
	public Car() {
		System.out.println("Car::Constructor");
	}

	//Setter Injection
	public void setEngine(IEngine engine) {
		System.out.println("setEngine() method called");
		this.engine = engine;
	}

	public void drive() {
		int status = engine.start();
		if (status == 0) {
			System.out.println("Journey Started");
		}
	}
}
