package com.ustglobal.immutable;

public class TestMyString {
	public static void main(String[] args) {
		MyString m=new MyString(1, "aisiri");
		System.out.println(m.getRollno());
		System.out.println(m.getName());
		System.out.println(m);
		
		MyString m1=m.changeContent(2, "bali");
		System.out.println(m1.getRollno());
		System.out.println(m1.getName());
		System.out.println(m1);
		
	}
	
}
