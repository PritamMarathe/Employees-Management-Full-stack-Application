package com.EmployeeManagmentSystem.exception;


public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message); //call the parent class constrator
	}

	
}
