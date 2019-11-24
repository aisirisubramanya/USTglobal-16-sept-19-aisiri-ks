package com.ustglobal.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TeacherMainArrayList {
	public static void main(String[] args) {
		
		ArrayList<Teacher> a=new ArrayList<Teacher>();
		
		Teacher t1=new Teacher(1, "uday pawar", "java");
		Teacher t2=new Teacher(2, "preethm", "sql");
		Teacher t3=new Teacher(1, "gowthm", "jdbc");
		
		a.add(t1);
		a.add(t2);
		a.add(t3);
		
System.out.println("*********************for loop*********************");
		
		for(int i=0;i<a.size();i++) {
			Teacher t=a.get(i);
			System.out.println(t);
		}
		
		System.out.println("*********************for each loop*********************");
		
		for(Teacher t:a) {
			System.out.println(t);
		}
		
		System.out.println("*********************iterator loop*********************");
		
		Iterator<Teacher> i=a.iterator();
		while(i.hasNext()) {
			Teacher t=i.next();
			System.out.println(t);
		}
		
		System.out.println("*********************list iterator loop*********************");
		
		ListIterator<Teacher> l=a.listIterator();
		while(l.hasNext()) {
			Teacher t=l.next();
			System.out.println(t);
		}
	}
}
