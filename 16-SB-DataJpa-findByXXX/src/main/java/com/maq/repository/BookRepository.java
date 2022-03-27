package com.maq.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maq.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	public List<Book> findByBookPrice(Integer price);
	
	public List<Book> findByBookNameAndBookPrice(String name, int price);
	
	public List<Book> findByBookPriceGreaterThan(Integer price);
		
}