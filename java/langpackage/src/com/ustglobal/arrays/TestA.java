package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] num=new int[5];
		
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		for( int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("************************************************************");
		
		char[] ch= {'a','b','c'};
		for(char i:ch) {
			System.out.println(i);
		}
		
		System.out.println("************************************************************");
		byte[] b= {1,2,3,4,5};
		for( int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		for(int i:b ) {
			System.out.println(i);
		}
		
		System.out.println("************************************************************");
		double[] d= {1.4,5.9,8.9,0.5};
		for(int i =0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		for(double i:d) {
			System.out.println(i);
		}
		System.out.println("************************************************************");
		String[] arr= {"aisi","bali","subbi"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
