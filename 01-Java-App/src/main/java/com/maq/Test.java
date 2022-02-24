package com.maq;

public class Test 
{
	public static void main(String[] args) {
		
//		//Without Dependency Injection
//		Car car = new Car();
		
//		//With Constructor Injection
//		Engine  engine = new Engine();
//		Car car = new Car(engine);
		
		//With Setter Injection
		Engine  engine = new Engine();
		Car car = new Car();
		car.setEngine(engine);
		
		car.drive();
	}
}
