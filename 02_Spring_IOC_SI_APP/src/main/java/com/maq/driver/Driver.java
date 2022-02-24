package com.maq.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maq.beans.Car;

public class Driver 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Car car = context.getBean(Car.class);
		car.drive();

	}
}
