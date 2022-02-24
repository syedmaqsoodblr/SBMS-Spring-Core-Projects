package com.maq.beans;

public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("Diesel Engine :: Constructor");
	}
	
	public int start() {
		System.out.println("Diesel Engine :: start() method called");
		return 0;
	}
}
