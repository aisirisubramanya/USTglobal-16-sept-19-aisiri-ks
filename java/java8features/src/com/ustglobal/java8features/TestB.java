package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {
		
		Student s1=new Student(1, "anu", 89);
		
		Predicate<Student> p=s->{
			if(s.percentage>=35) {
				return true;
			}
			else {
				return false;
			}
		};
		
		boolean res=p.test(s1);
		if(res==true) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		System.out.println(res);
	}
}
