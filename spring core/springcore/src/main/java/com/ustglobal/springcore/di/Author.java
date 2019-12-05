package com.ustglobal.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Author {
	private String name;
	
	private String penName;
	
//	@Autowired
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPenName() {
		return penName;
	}

	public void setPenName(String penName) {
		this.penName = penName;
	}
}
