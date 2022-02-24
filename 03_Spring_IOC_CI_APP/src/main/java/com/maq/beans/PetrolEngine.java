package com.maq.beans;

public class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("Petrol Engine :: Constructor");
	}
	
	public int start() {
		System.out.println("Petrol Engine :: start() method called");
		return 0;
	}
}
