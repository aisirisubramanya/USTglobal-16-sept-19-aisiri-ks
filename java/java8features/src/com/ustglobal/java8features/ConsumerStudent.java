package com.ustglobal.java8features;

import java.util.function.Consumer;

public class ConsumerStudent {
	public static void main(String[] args) {
		Consumer<Student> c=(s)->{
			System.out.println(s);
			System.out.println("***********************************************");
		};
		Student s=new Student(1, "pooja", 79);
		c.accept(s);
		Student s1=new Student(2, "suppi", 79);
		c.accept(s1);
		
	}
}
