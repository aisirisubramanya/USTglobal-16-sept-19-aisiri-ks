package com.ustglobal.collectionframework;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student s1=new Student(1, "anu", 88.8);
		Student s2=new Student(2, "akshatha", 82.8);
		Student s3=new Student(3, "suppi", 85.8);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for (int i = 0; i < al.size(); i++) {
			Student s=al.get(i);
			System.out.println("id :"+s.id);
			System.out.println("name :"+s.name);
			System.out.println("percentage :"+s.percentage);
		}
	}
}
