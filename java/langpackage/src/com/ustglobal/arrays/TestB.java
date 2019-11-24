package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {
		int[] num= {10,20,30,40};
		//ArrayIndexOutOfBoundException

		//		System.out.println(num[10]);

		receive(num);
//		receive(str);
		int[] values=getArray();
		for(int val:values) {
			System.out.println(val);
		}

	}

	static void receive(int[] num) {
		for(int n:num) {
			System.out.println(n);
		}
	}
	static int[] getArray() {
		int[] values= {20,30,40,50};
		return values;
	}
	static String[] getArray1() { 
		String[] str= {"aisi","subbi","bali"};
		return str;
	}
	static void receive(String[] num) {
		for(String n:num) {
			System.out.println(n);
		}
	}

}
