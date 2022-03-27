package com.maq.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maq.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	@Query("from Book")
	public List<Book> getAllBooks();

	@Query(value = "select * from Book_info", nativeQuery = true)
	public List<Book> getAllBooksNative();
	
}