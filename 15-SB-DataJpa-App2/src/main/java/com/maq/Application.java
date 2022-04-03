package com.maq;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.maq.entity.Book;
import com.maq.entity.Player;
import com.maq.repository.BookRepository;
import com.maq.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		BookRepository bookRepo = context.getBean(BookRepository.class);
		/*Book b1 = new Book(101, "Spring", 450);
		Book b2 = new Book(102, "Python", 550);
		Book b3 = new Book(103, "JS", 650);
		Book b4 = new Book(104, "Angular", 650);
		Book b5 = new Book(105, "React JS", 650);
		Book b6 = new Book(106, "Type Script", 650);
		Book b7 = new Book(107, "Data Science", 650);
		Book b8 = new Book(108, "Salesforce", 650);
		
		bookRepo.saveAll(Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8));
		
		Book b1 = new Book(101, "Spring Boot", 500);
		bookRepo.save(b1);*/
		
		Optional<Book> findById = bookRepo.findById(101);
		if (findById.isPresent()) {
		    System.out.println(findById.get());
		} else {
		    System.out.printf("No book found with id 101");
		}
		
		/*Iterable<Book> findAllById = bookRepo.findAllById(Arrays.asList(101, 102));
		findAllById.forEach(i -> {
			System.out.println(i);
		});*/
		
		/*Iterable<Book> findAll = bookRepo.findAll();
		findAll.forEach(i -> {
			System.out.println(i);
		});*/
		
		/*PageRequest pageRequest = PageRequest.of(1, 3);
		Page<Book> pageData = bookRepo.findAll(pageRequest);
		List<Book> findAll = pageData.getContent();
		findAll.forEach(i -> {
			System.out.println(i);
		});*/
		
		/*List<Book> findAll = bookRepo.findAll(Sort.by("bookName").ascending());
		findAll.forEach(i -> {
			System.out.println(i);
		});*/
		
		/*Book book = new Book();
		book.setBookPrice(450);
		book.setBookName("Spring");
		Example<Book> of = Example.of(book);
		List<Book> findAll = bookRepo.findAll(of);
		findAll.forEach(i -> {
			System.out.println(i);
		});*/
		
		// bookRepo.deleteById(103);

		System.out.println("Count of Book_Info table: " + bookRepo.count());
	
	}

}
