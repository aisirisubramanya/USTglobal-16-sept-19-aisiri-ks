package com.ustglobal.assignment1;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TeacherMainVector {
	public static void main(String[] args) {
		
		Vector<Teacher> v=new Vector<Teacher>();
		
		Teacher t1=new Teacher(1, "uday pawar", "java");
		Teacher t2=new Teacher(2, "preethm", "sql");
		Teacher t3=new Teacher(1, "gowthm", "jdbc");
		
		v.add(t1);
		v.add(t2);
		v.add(t3);
		
System.out.println("*********************for loop*********************");
		
		for(int i=0;i<v.size();i++) {
			Teacher t=v.get(i);
			System.out.println(t);
		}
		
		System.out.println("*********************for each loop*********************");
		
		for(Teacher t:v) {
			System.out.println(t);
		}
		
		System.out.println("*********************iterator loop*********************");
		
		Iterator<Teacher> i=v.iterator();
		while(i.hasNext()) {
			Teacher t=i.next();
			System.out.println(t);
		}
		
		System.out.println("*********************list iterator loop*********************");
		
		ListIterator<Teacher> l=v.listIterator();
		while(l.hasNext()) {
			Teacher t=l.next();
			System.out.println(t);
		}
	}
}
