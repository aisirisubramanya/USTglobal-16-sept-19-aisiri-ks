package com.ustglobal.collectionframework;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {
		
		ArrayList<Object> a=new ArrayList<Object>();
		a.add(10);
		a.add(29.7);
		a.add(true);
		a.add("aisi");
		
		for(Object i:a) {
			System.out.println(i);
		}
	}
}
