package com.ustglobal.collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(12);
		s.add(34.5);
		s.add("more");
		s.add(true);
		s.add(null);
		
		System.out.println("===================using for loop===================");
		
		for (int i = 0; i < s.size(); i++) {
			Object o5=i;
			System.out.println(o5);
		}
		
		System.out.println("===================using for each===================");
		
		for (Object o : s) {
			System.out.println(o);
		}
		
		System.out.println("===================using iterator===================");

		Iterator i=s.iterator();
		while(i.hasNext()) {
			Object o1=i.next();
			System.out.println(o1);
		}
		
		System.out.println("===================using ListIterator===================");

		ListIterator l=s.listIterator();
		while(l.hasPrevious()) {
			Object o4=l.previous();
			System.out.println(o4);
		}
	}
}
