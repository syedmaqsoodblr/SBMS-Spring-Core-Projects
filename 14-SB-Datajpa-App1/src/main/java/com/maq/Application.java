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
		
		/* PlayerRepository playerrepo = context.getBean(PlayerRepository.class);
		System.out.println(playerrepo.getClass().getName());
			
		Player p1 = new Player();
		p1.setPlayerId(202);
		p1.setPlayerName("Sehwag");
		p1.setPlayerAge(40);
		p1.setPlayerGender("Male");
		p1.setPlayerCity("Delhi");
		
		playerrepo.save(p1);
		
		Optional<Player> row = playerrepo.findById(201);
		if(row.isPresent()) {
			System.out.println(row.get());
		}
		
		System.out.println("Done...");*/
		
		BookRepository bookRepo = context.getBean(BookRepository.class);
		/*Book b1 = new Book(101, "Spring", 450);
		Book b2 = new Book(102, "Python", 550);
		Book b3 = new Book(103, "JS", 650);
		
		bookRepo.saveAll(Arrays.asList(b1, b2, b3));*/
		
		/*Book b1 = new Book(101, "Spring Boot", 500);
		bookRepo.save(b1);*/
		
		/*Iterable<Book> findAllById = bookRepo.findAllById(Arrays.asList(101, 102));
		findAllById.forEach(i -> {
			System.out.println(i);
		});*/
		
		/*Iterable<Book> findAll = bookRepo.findAll();
		findAll.forEach(i -> {
			System.out.println(i);
		});*/
	}

}
