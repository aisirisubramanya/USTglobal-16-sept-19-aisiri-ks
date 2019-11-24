package com.ustglobal.exception.second;

import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("enter age");
			int age=sc.nextInt();
			System.out.println("age is "+age);
			
			System.out.println(age/0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally executed");
		}
	}
}
