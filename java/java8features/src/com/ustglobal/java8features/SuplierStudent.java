package com.ustglobal.java8features;

import java.util.function.Supplier;

public class SuplierStudent {
	public static void main(String[] args) {
		Supplier<Student> s=()->new Student(1, "megha", 87);
		Student s1=s.get();
		System.out.println(s1);
		
		Supplier<Integer> i=()->11;
		int value=i.get();
		System.out.println("value="+value);
		
		Supplier<String> str=()->"good evening";
		String val=str.get();
		System.out.println(val);
	}
}
