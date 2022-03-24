package com.maq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK_INFO")
public class Book {

	@Id
	@Column(name = "BOOK_ID")
	private Integer book;

	@Column(name = "BOOK_NAME")
	private String bookName;

	@Column(name = "BOOK_PRICE")
	private Integer bookPrice;

	public Book() {
		super();
	}

	public Book(Integer book, String bookName, Integer bookPrice) {
		super();
		this.book = book;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [book=" + book + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}

}
