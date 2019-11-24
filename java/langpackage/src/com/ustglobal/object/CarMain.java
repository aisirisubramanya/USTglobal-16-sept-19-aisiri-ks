package com.ustglobal.object;

public class CarMain {
	public static void main(String[] args) {
		Car c=new Car(50000,"bmw","white");
		Car c1=new Car(50500,"audi","black");
		Car c2=new Car(500000,"benz","blue");
		System.out.println("cost is "+c.hashCode());
		System.out.println(c.toString());
		System.out.println("cost is "+c1.hashCode());
		System.out.println(c1.toString());
		System.out.println("cost is "+c2.hashCode());
		System.out.println(c2.toString());
	}
}
