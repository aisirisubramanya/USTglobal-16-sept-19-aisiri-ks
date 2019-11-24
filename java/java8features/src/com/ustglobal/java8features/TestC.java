package com.ustglobal.java8features;

import java.util.function.Function;

public class TestC {
	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		int square=f.apply(2);
		System.out.println("square of 4 is "+square);
	}
}
