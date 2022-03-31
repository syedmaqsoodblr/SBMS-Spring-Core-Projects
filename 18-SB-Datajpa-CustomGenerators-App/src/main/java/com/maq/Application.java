package com.maq;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.maq.entity.OrderDetails;
import com.maq.repository.OrderDetailsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		OrderDetailsRepository orderRepo = context.getBean(OrderDetailsRepository.class);
		
		OrderDetails order = new OrderDetails();
		order.setOrderBy("Syed");
		order.setOrderPlacedDate(new Date());
		
		OrderDetails currOrder = orderRepo.save(order);
		System.out.println(currOrder);
		System.out.println("Done...");
	}

}
