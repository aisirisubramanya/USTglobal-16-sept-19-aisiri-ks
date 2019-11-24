package com.ustglobal.beanclass;

public class TestA {
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(12);
		s.setName("kull's");
		s.setRollNo(13);
		
		Database d=new Database();
		d.receive(s);
	}
}
