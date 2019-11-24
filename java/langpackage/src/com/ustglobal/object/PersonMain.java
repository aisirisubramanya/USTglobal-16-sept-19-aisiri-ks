package com.ustglobal.object;

public class PersonMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p=new Person(1, "anu");
		System.out.println("p id "+p.id);
		System.out.println("p name "+p.name);
		
		System.out.println("after cloning");
		
		Object o=p.clone();
		Person p1=(Person)o;
		p1.id=2;
		p1.name="akshu";
		System.out.println("p1 id "+p1.id);
		System.out.println("p1 name "+p1.name);
	}
}
