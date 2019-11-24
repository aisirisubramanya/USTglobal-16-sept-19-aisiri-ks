package com.ustglobal.java8features;

import java.util.function.Function;

public class FunctionalStudent {
	public static void main(String[] args) {
		Function<Integer, Student> f=id->{
			Student s=new Student(2, "akshatha", 84);
			s.id=id;
			return s;
		};
		Student s=f.apply(4);
		System.out.println(s);
	}
}
