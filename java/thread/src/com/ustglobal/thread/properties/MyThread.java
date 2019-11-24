package com.ustglobal.thread.properties;

public class MyThread extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		String tname=Thread.currentThread().getName();
		System.out.println("current thread name is "+tname);
		
		MyThread t=new MyThread();
		String mname=t.getName();
		System.out.println("MyThread name is "+mname);
		
		Thread.currentThread().setName("bala");
		
		t.setName("golu");
		System.out.println("MyThread name is "+t.getName()+" after setting");
		
		System.out.println(10/0);
		
		System.out.println("main ended");
	}
}
