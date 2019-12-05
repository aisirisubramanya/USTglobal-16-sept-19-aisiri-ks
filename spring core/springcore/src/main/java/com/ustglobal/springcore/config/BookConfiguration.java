package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class BookConfiguration {
	
	@Bean(name = "author")
	public Author author() {
		Author author=new Author();
		author.setName("chethan bhagat");
		author.setPenName("bhagat");
		author.getBook();
		return author; 
	}
	
	@Bean(name="book")
	public Book book() {
		Book book=new Book();
		book.setAuthor("chethan bhagat");
		book.setBname("3 mistakes");
		book.setPrice(400);
		return book;
		
	}
}
