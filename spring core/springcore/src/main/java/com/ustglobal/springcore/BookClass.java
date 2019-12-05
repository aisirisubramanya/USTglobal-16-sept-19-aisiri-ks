package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Author;

public class BookClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bookbean.xml");
		Author author=context.getBean(Author.class);
		System.out.println(author.getName());
		System.out.println(author.getPenName());
		System.out.println(author.getBook().getAuthor());
		System.out.println(author.getBook().getBname());
		System.out.println(author.getBook().getPrice());
	}
}
