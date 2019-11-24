package com.ustglobal.exception.first;

public class TestG {
	public static void main(String[] args) {
		System.out.println("main started");

		PayTM p=new PayTM();
		try {
			p.book();
		}
		catch (ArithmeticException e) {
			System.out.println("exception caught in main method");
		}
		finally {
			System.out.println("finally executed");
		}
		System.out.println("main ended");
	}
}
