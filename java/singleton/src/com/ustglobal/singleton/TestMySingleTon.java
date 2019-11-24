package com.ustglobal.singleton;

public class TestMySingleTon {
	public static void main(String[] args) {
		MySingleTon m=MySingleTon.getDbConnection();
		MySingleTon m1=MySingleTon.getDbConnection();
		System.out.println(m.equals(m1));
		m.s="ais";
		System.out.print(m.s);
		m1.s="iri";
		System.out.println(m1.s);
		System.out.println("hash code of m = "+m.hashCode());
		System.out.println("hash code of m1= "+m1.hashCode());
	}
}
