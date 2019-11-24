package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestS {
	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(new Student(5,"vikram",56.7));
		al.add(new Student(3,"vijay",37.7));
		al.add(new Student(6,"yash",35.7));
		al.add(new Student(4,"akshy",65.7));
		al.add(new Student(1,"aishu",90.7));
		
		Helper h=new Helper();
//		h.display(al);
//		h.displayFailedStudents(al);
//		h.displayPassedStudents(al);
		h.topper(al);
	}
}
