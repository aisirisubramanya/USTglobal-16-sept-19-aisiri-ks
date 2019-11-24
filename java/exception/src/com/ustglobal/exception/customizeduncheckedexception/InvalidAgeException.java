package com.ustglobal.exception.customizeduncheckedexception;

public class InvalidAgeException extends RuntimeException {
	String  message="invalid age below 18 years not allowed";
	
	public InvalidAgeException(String message) {
		this.message = message;
	}

	public InvalidAgeException() {
		
	}

	@Override
	public String getMessage() {
		return message;
	}
}
