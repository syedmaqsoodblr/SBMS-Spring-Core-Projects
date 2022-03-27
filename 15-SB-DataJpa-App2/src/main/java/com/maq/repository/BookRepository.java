package com.maq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maq.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
}