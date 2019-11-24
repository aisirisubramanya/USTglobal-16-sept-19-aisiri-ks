package com.ustglobal.assignment1;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TeacherMainStack {
	public static void main(String[] args) {
		
		Stack<Teacher> s=new Stack<Teacher>();
		
		Teacher t1=new Teacher(1, "uday pawar", "java");
		Teacher t2=new Teacher(2, "preethm", "sql");
		Teacher t3=new Teacher(1, "gowthm", "jdbc");
		
		s.add(t1);
		s.add(t2);
		s.add(t3);
		
System.out.println("*********************for loop*********************");
		
		for(int i=0;i<s.size();i++) {
			Teacher t=s.get(i);
			System.out.println(t);
		}
		
		System.out.println("*********************for each loop*********************");
		
		for(Teacher t:s) {
			System.out.println(t);
		}
		
		System.out.println("*********************iterator loop*********************");
		
		Iterator<Teacher> i=s.iterator();
		while(i.hasNext()) {
			Teacher t=i.next();
			System.out.println(t);
		}
		
		System.out.println("*********************list iterator loop*********************");
		
		ListIterator<Teacher> l=s.listIterator();
		while(l.hasNext()) {
			Teacher t=l.next();
			System.out.println(t);
		}
	}
}
