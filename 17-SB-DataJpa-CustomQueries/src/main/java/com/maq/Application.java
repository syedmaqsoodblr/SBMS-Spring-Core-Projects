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

		/*List<Book> allBooks = bookRepo.getAllBooks();
		allBooks.forEach(i -> {
			System.out.println(i);
		});*/
		
		List<Book> allBooksNative = bookRepo.getAllBooksNative();
		allBooksNative.forEach(i -> {
			System.out.println(i);
		});
	}

}
