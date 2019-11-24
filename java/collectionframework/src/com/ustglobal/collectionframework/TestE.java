package com.ustglobal.collectionframework;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("anu");
		
		Object o=a.get(0);
		String s=(String) o;
		
		System.out.println(s.toUpperCase());
	}
}
