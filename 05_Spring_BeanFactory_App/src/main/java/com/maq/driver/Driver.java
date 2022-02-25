package com.maq.driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.maq.beans.Car;

public class Driver 
{
	public static void main(String[] args) {
		
//		// Objects are created n DI is performed automatically at startup
//		// ApplicationContext is eager loading
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Objects are not created for the beans automatically in BeanFactory
		// We need to use getBean method to create the objects on demand
		// BeanFactory is lazy loading
		Resource resource = new ClassPathResource("beans.xml"); //where file is available
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Car car = factory.getBean(Car.class);
		System.out.println(car.hashCode());
		car.drive();		
		
		Car car2 = factory.getBean(Car.class);
		System.out.println(car2.hashCode());
		car2.drive();

	}
}
