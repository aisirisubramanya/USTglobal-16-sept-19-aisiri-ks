package com.ustglobal.object;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(1, "aisiri",50000);
		Employee e2=new Employee(2, "akshatha",30000);
		Employee e3=new Employee(1, "aisiri",50000);
		Employee e4=e3;
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());


	}
}
