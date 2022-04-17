package com.maq;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.maq.entity.Book;
import com.maq.entity.Player;
import com.maq.repository.BookRepository;
import com.maq.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		PlayerRepository playerrepo = context.getBean(PlayerRepository.class);
		
		Optional<Player> row = playerrepo.findById(201);
		if(row.isPresent()) {
			System.out.println(row.get());
		}
		
		System.out.println("Done...");
	}

}
