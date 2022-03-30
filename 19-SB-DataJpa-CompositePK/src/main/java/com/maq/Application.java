package com.maq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.maq.service.AccountService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		AccountService accServicebean = context.getBean(AccountService.class);
		accServicebean.saveAccData();
		accServicebean.getDataUsingPK();
		System.out.println("Done...");
		context.close();

	}

}
