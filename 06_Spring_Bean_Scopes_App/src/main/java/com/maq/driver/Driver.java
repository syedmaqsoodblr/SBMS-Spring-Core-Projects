package com.maq.driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.maq.beans.TicketGenerator;

public class Driver 
{
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		TicketGenerator tg1 = context.getBean(TicketGenerator.class);
		System.out.println(tg1.hashCode());
		
		TicketGenerator tg2 = context.getBean(TicketGenerator.class);
		System.out.println(tg2.hashCode());

	}
}
