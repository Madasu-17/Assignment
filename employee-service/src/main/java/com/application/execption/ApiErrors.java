package com.application.execption;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ApiErrors {

	private String message;
	private HttpStatus status;
	private LocalDateTime timeStamp;

	public ApiErrors() {
		super();
	}

	public ApiErrors(String message, HttpStatus status, LocalDateTime timeStamp) {
		super();
		this.message = message;
		this.status = status;
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "ApiErrors [message=" + message + ", status=" + status + ", timeStamp=" + timeStamp + "]";
	}

}
