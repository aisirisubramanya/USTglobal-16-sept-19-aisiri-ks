package com.ustglobal.collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(45.6);
		a.add("family");
		a.add(true);
		
		ListIterator li=a.listIterator();
		
		System.out.println("-----------------> forward");
		
		while(li.hasNext()) {
			Object o=li.next();
			System.out.println(o);
		}
		
		System.out.println("<----------------- backward");
		
		while(li.hasPrevious()) {
			Object o=li.previous();
			System.out.println(o);
		}
	}
}
