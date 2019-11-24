package com.ustglobal.hasarelation.weak;

public class TestA {
	public static void main(String[] args) {
		Person p=new Person();
		p.name="aisu";
		System.out.println(p.name);
		p.sleep();
		p.eat();
		System.out.println("**************************************************************");
		
		//has-a relation
		
		p.m.write();
		System.out.println(p.m.name);
		
	}
}
