package com.example.demo.exception;

public class UserNotFoundException extends RuntimeException {

	String message;

	public String getMessage() {
		return message;
	}


	public UserNotFoundException(String message) {
		super();
		this.message = message;
	}

}
