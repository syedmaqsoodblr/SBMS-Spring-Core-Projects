package com.maq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.maq.service.MakeMyTripService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		MakeMyTripService bean = context.getBean(MakeMyTripService.class);
//		bean.bookTicket();
//		bean.getTicketSync();
		bean.getTicketAsync();
	}

}
