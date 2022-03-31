package com.maq.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.maq.entity.Book;
import com.maq.repository.BookRepository;

@Service
public class BookService {
	
	private BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Transactional(rollbackOn=Exception.class)
	public void saveData() {
		
		Book b1 = new Book(116, "Spring", 450);
		bookRepo.save(b1);
		
		int i = 10 / 0;
		
		Book b2 = new Book(117, "Python", 550);
		bookRepo.save(b2);
		
	}
}
