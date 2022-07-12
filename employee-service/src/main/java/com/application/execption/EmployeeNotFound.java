package com.application.execption;

public class EmployeeNotFound extends RuntimeException {

	public EmployeeNotFound(String message) {

		super(message);
	}
}
