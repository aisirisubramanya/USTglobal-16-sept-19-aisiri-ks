package com.ustglobal.google;

public class TestGoogle {
	public static void main(String[] args) {
		Browser b=new Browser();
		
		Google g=new GoogleDrive();
		b.open(g);
		
		System.out.println("*********************************");

		Google g1=new Gmail();
		b.open(g1);
	}
}
