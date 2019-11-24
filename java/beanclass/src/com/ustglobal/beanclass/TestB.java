package com.ustglobal.beanclass;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Scanner class");
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("enter age");
		int age =s.nextInt();
		System.out.println("age is "+age);
		
		
		System.out.println("enter name");
		String name =s.next();
		System.out.println("name is "+name);
		
		
		System.out.println("enter full name");
		String full_name =s.nextLine();
		System.out.println("full name is "+full_name);
	}
}
