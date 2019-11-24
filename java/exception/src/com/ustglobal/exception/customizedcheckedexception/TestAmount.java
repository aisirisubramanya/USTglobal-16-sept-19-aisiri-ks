package com.ustglobal.exception.customizedcheckedexception;

public class TestAmount {
	public static void main(String[] args) {
		System.out.println("main started");

		ValidateAmount v=new ValidateAmount();
		try {
			v.checkAmount(70000);
			System.out.println("withdraw your cash");
		} catch (InvalidAmountException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("main ended");
	}
}
