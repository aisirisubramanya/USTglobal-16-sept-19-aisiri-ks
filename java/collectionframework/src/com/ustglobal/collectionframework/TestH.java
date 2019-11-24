package com.ustglobal.collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(12);
		v.add(34.5);
		v.add("more");
		v.add(true);
		v.add(null);
		
		System.out.println("===================using for loop===================");
		
		for (int i = 0; i < v.size(); i++) {
			Object o5=i;
			System.out.println(o5);
		}
		
		System.out.println("===================using for each===================");
		
		for (Object o : v) {
			System.out.println(o);
		}
		
		System.out.println("===================using iterator===================");

		Iterator i=v.iterator();
		while(i.hasNext()) {
			Object o1=i.next();
			System.out.println(o1);
		}
		
		System.out.println("===================using ListIterator===================");

		ListIterator l=v.listIterator();
		while(l.hasPrevious()) {
			Object o4=l.previous();
			System.out.println(o4);
		}
	}
}
