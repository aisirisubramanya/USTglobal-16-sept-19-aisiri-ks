package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestVote {
	public static void main(String[] args) {
		Vote v1=new Vote("aisiri", 21);

		Predicate<Vote> p=s->{
			if(s.age>=18) {
				return true;
			}
			else {
				return false;
			}
		};
		boolean res=p.test(v1);
		System.out.println(res);
	}
}