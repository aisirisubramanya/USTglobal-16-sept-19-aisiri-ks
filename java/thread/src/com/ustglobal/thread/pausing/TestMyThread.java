package com.ustglobal.thread.pausing;

public class TestMyThread {
	public static void main(String[] args) {

		System.out.println("main started");

		MyThread t=new MyThread();
		t.start();

		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	}
}
