package com.ustglobal.hasarelation.weak;

public class TestCar {
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.name);
		c.drive();
		System.out.println("***********************************");
		System.out.println(c.m.movie);
		c.m.song();
	}
}
