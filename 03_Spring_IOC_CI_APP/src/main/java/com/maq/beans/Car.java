package com.maq.beans;

public class Car
{

	private IEngine engine = null;

	//Setter Injection
	public Car(IEngine engine) {
		System.out.println("Car :: Constructor");
		this.engine = engine;
	}

	public void drive() {
		int status = engine.start();
		if (status == 0) {
			System.out.println("Journey Started");
		}
	}
}
