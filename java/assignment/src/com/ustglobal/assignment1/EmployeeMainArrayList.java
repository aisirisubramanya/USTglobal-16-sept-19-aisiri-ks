package com.ustglobal.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class EmployeeMainArrayList{
	public static void main(String[] args) {

		ArrayList<Employee> a=new ArrayList<Employee>();
		
		Employee e1=new Employee(1, "Pavan", 56000);
		Employee e2=new Employee(2, "pradhan", 46000);
		Employee e3=new Employee(3, "beena", 54000);
		
		a.add(e1);
		a.add(e2);
		a.add(e3);
		
		System.out.println("*********************for loop*********************");
		
		for(int i=0;i<a.size();i++) {
			Employee ee=a.get(i);
			System.out.println(ee);
		}
		
		System.out.println("*********************for each loop*********************");
		
		for(Employee ee:a) {
			System.out.println(ee);
		}
		
		System.out.println("*********************iterator loop*********************");
		
		Iterator<Employee> i=a.iterator();
		while(i.hasNext()) {
			Employee ee=i.next();
			System.out.println(ee);
		}
		
		System.out.println("*********************list iterator loop*********************");
		
		ListIterator<Employee> l=a.listIterator();
		while(l.hasNext()) {
			Employee ee=l.next();
			System.out.println(ee);
		}
	}
}
