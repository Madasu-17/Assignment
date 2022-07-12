package com.application.execption;

import java.time.LocalDateTime;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<Object> handleEmployeeNotFound(EmployeeNotFound ex,HttpStatus status, WebRequest request) {

		String message= ex.getMessage();
		message=("Employee Not Found");
		ApiErrors apiErrors = new ApiErrors(message,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(apiErrors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message= ex.getMessage();
		message=("Request Method is not Supported, Change the Method");
		ApiErrors apiErrors = new ApiErrors(message,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(apiErrors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message= ex.getMessage();
		message=("Media Type Not Supported, Check the Media Type");
		ApiErrors apiErrors = new ApiErrors(message,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(apiErrors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message= ex.getMessage();
		message=("Missing Path Variable");
		ApiErrors apiErrors = new ApiErrors(message,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(apiErrors);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message= ex.getMessage();
		message=("Handleing Type Miss match");
		ApiErrors apiErrors = new ApiErrors(message,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(apiErrors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message= ex.getMessage();
		message=("HTTP Message is Not Readable");
		ApiErrors apiErrors = new ApiErrors(message,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(apiErrors);
	}

}
