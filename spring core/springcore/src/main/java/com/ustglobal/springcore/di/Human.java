package com.ustglobal.springcore.di;

import org.springframework.stereotype.Component;

@Component("human")
public class Human implements Animal{

	@Override
	public void makeSound() {
		System.out.println("bla bla bla bla.................");
	}

}
