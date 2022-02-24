package com.maq;

public class Car // extends Engine
{

//	// Composition
//	public void drive() {
//		// int status = super.start(); using Inheritance
//		Engine engine = new Engine();
//		int status = engine.start();
//		if (status == 0) {
//			System.out.println("Journey Started");
//		}
//	}
	
	private IEngine engine = null;

//	//Constructor Injection
//	public Car(IEngine engine) {
//		this.engine = engine;
//	}
	
	//Setter Injection
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	public void drive() {
		int status = engine.start();
		if (status == 0) {
			System.out.println("Journey Started");
		}
	}
}
