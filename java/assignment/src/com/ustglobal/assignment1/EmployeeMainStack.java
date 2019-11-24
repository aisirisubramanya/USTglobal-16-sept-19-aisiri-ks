package com.ustglobal.assignment1;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class EmployeeMainStack{
	public static void main(String[] args) {

		Stack<Employee> s=new Stack<Employee>();
		
		Employee e1=new Employee(1, "Pavan", 56000);
		Employee e2=new Employee(2, "pradhan", 46000);
		Employee e3=new Employee(3, "beena", 54000);
		
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
		System.out.println("*********************for loop*********************");
		
		for(int i=0;i<s.size();i++) {
			Employee ee=s.get(i);
			System.out.println(ee);
		}
		
		System.out.println("*********************for each loop*********************");
		
		for(Employee ee:s) {
			System.out.println(ee);
		}
		
		System.out.println("*********************iterator loop*********************");
		
		Iterator<Employee> i=s.iterator();
		while(i.hasNext()) {
			Employee ee=i.next();
			System.out.println(ee);
		}
		
		System.out.println("*********************list iterator loop*********************");
		
		ListIterator<Employee> l=s.listIterator();
		while(l.hasNext()) {
			Employee ee=l.next();
			System.out.println(ee);
		}
	}
}
