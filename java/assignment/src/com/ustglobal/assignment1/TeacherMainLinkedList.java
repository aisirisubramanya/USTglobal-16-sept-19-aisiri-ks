package com.ustglobal.assignment1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TeacherMainLinkedList {
	public static void main(String[] args) {
		
		LinkedList<Teacher> li=new LinkedList<Teacher>();
		
		Teacher t1=new Teacher(1, "uday pawar", "java");
		Teacher t2=new Teacher(2, "preethm", "sql");
		Teacher t3=new Teacher(1, "gowthm", "jdbc");
		
		li.add(t1);
		li.add(t2);
		li.add(t3);
		
System.out.println("*********************for loop*********************");
		
		for(int i=0;i<li.size();i++) {
			Teacher t=li.get(i);
			System.out.println(t);
		}
		
		System.out.println("*********************for each loop*********************");
		
		for(Teacher t:li) {
			System.out.println(t);
		}
		
		System.out.println("*********************iterator loop*********************");
		
		Iterator<Teacher> i=li.iterator();
		while(i.hasNext()) {
			Teacher t=i.next();
			System.out.println(t);
		}
		
		System.out.println("*********************list iterator loop*********************");
		
		ListIterator<Teacher> l=li.listIterator();
		while(l.hasNext()) {
			Teacher t=l.next();
			System.out.println(t);
		}
	}
}
