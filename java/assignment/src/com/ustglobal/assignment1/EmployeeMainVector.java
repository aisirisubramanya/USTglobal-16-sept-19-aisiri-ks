package com.ustglobal.assignment1;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EmployeeMainVector{
	public static void main(String[] args) {

		Vector<Employee> v=new Vector<Employee>();
		
		Employee e1=new Employee(1, "Pavan", 56000);
		Employee e2=new Employee(2, "pradhan", 46000);
		Employee e3=new Employee(3, "beena", 54000);
		
		v.add(e1);
		v.add(e2);
		v.add(e3);
		
		System.out.println("*********************for loop*********************");
		
		for(int i=0;i<v.size();i++) {
			Employee ee=v.get(i);
			System.out.println(ee);
		}
		
		System.out.println("*********************for each loop*********************");
		
		for(Employee ee:v) {
			System.out.println(ee);
		}
		
		System.out.println("*********************iterator loop*********************");
		
		Iterator<Employee> i=v.iterator();
		while(i.hasNext()) {
			Employee ee=i.next();
			System.out.println(ee);
		}
		
		System.out.println("*********************list iterator loop*********************");
		
		ListIterator<Employee> l=v.listIterator();
		while(l.hasNext()) {
			Employee ee=l.next();
			System.out.println(ee);
		}
	}
}
