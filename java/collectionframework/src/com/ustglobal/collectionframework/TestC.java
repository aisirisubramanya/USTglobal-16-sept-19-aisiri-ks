package com.ustglobal.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		
		ArrayList<Object> a=new ArrayList<Object>();
		a.add(23);
		a.add(98.7);
		a.add(true);
		a.add("kirani");
		
		Iterator it=a.iterator();
		
		Object o1=it.next();
		System.out.println("obj1"+o1);
		
		Object o2=it.next();
		System.out.println("obj2"+o2);
		
		Object o3=it.next();
		System.out.println("obj3"+o3);
		
		Object o4=it.next();
		System.out.println("obj4"+o4);
		
		Boolean b=it.hasNext();
		System.out.println("has next:"+b);
		
//		Object o5=it.next();
//		System.out.println("obj5"+o5);
//		*****************NoSuchElementException********************** 
		System.out.println("******************using for loop******************");
		for(int i=0;i<a.size();i++) {
			Object o=a.get(i);
			System.out.println(o);
		}
		System.out.println("size of array is "+a.size());
		
		ArrayList al1=new ArrayList();
		al1.add(12);
		al1.add(233.44);
		al1.add("momo");
		al1.add(false);
		
		System.out.println("******************using iterator******************");
		Iterator it1=al1.iterator();
		while(it1.hasNext())
//		for(;it1.hasNext();)                =====>we can use both for loop and while loop<=====s
		{
			Object o=it1.next();
			System.out.println(o);
		}
	}
}
