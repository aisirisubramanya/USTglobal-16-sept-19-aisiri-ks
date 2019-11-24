package com.ustglobal.assignment1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeMainLinkedList{
	public static void main(String[] args) {

		LinkedList<Employee> li=new LinkedList<Employee>();
		
		Employee e1=new Employee(1, "Pavan", 56000);
		Employee e2=new Employee(2, "pradhan", 46000);
		Employee e3=new Employee(3, "beena", 54000);
		
		li.add(e1);
		li.add(e2);
		li.add(e3);
		
		System.out.println("*********************for loop*********************");
		
		for(int i=0;i<li.size();i++) {
			Employee ee=li.get(i);
			System.out.println(ee);
		}
		
		System.out.println("*********************for each loop*********************");
		
		for(Employee ee:li) {
			System.out.println(ee);
		}
		
		System.out.println("*********************iterator loop*********************");
		
		Iterator<Employee> i=li.iterator();
		while(i.hasNext()) {
			Employee ee=i.next();
			System.out.println(ee);
		}
		
		System.out.println("*********************list iterator loop*********************");
		
		ListIterator<Employee> l=li.listIterator();
		while(l.hasNext()) {
			Employee ee=l.next();
			System.out.println(ee);
		}
	}
}
