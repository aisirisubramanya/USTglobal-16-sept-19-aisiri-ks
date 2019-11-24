package com.ustglobal.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("anupama");
		a.add("savitha");
		a.add("kavitha");
		a.add("sunitha");

		String s=a.get(0);
		//		System.out.println(s.toUpperCase());

		Iterator<String> i=a.iterator();

		while(i.hasNext()) {
			String s1=i.next();
			System.out.println(s1);
			//			System.out.println(s1.toUpperCase());
		}

		System.out.println("===================using list iterator===================");

		ListIterator<String> l=a.listIterator();
		while(l.hasNext()) {
			String s2=l.next();
			System.out.println(s2);
		}
		System.out.println("===================using for each===================");

		for(String s3:a) {
			System.out.println(s3);

		}
	}
}
