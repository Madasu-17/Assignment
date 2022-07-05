package com.zensar.exceptions;

public class StudentAlreadyExistException extends RuntimeException {
	private String message;

	public StudentAlreadyExistException() {
		super();
	}

	public StudentAlreadyExistException(String message) {
		super(message);
		this.message = message;
	}

}
