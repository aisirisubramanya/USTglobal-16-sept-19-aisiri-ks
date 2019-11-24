package com.ustglobal.collectionframework;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(12);
		al.add(22.5);
		al.add("ais");
		al.add(true);
		al.add(null);
		al.add('a');
		
		Object obj=al.get(2);
		System.out.println(obj);
		
		for(int i=0;i<6;i++) {
			Object o=al.get(i);
			System.out.println(o);
		}
	}
}
