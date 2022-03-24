package com.maq.repository;

import org.springframework.data.repository.CrudRepository;

import com.maq.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	
}