package com.ustglobal.collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(12);
		li.add(34.5);
		li.add("more");
		li.add(true);
		li.add(null);
		
		System.out.println("===================using for loop===================");
		
		for (int i = 0; i < li.size(); i++) {
			Object o5=i;
			System.out.println(o5);
		}
		
		System.out.println("===================using for each===================");
		
		for (Object o : li) {
			System.out.println(o);
		}
		
		System.out.println("===================using iterator===================");

		Iterator i=li.iterator();
		while(i.hasNext()) {
			Object o1=i.next();
			System.out.println(o1);
		}
		
		System.out.println("===================using ListIterator===================");

		ListIterator l=li.listIterator();
		while(l.hasPrevious()) {
			Object o4=l.previous();
			System.out.println(o4);
		}
	}
}
