package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread t=new MyIdThread();
		System.out.println(t.getId());
	
//		t.setPriority(0);-----> if priority is < 1 we will get a exception called as IllegalArgumentException.
//		t.setPriority(11);----> if priority is > 10 we will get a exception called as IllegalArgumentException.
		
		System.out.println("main ended");
	}
}
