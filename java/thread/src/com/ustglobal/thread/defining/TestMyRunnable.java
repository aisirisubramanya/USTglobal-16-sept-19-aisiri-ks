package com.ustglobal.thread.defining;

public class TestMyRunnable {
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		
		//mr.start();    -------> it gives error because it is not present in Runnable interface but present in Thread class
		
		Thread t=new Thread(mr);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	}
}
