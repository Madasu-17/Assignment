package com.zensar.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.zensar.entity.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

		@ExceptionHandler(value = NoSuchStudentExistsException.class )
		@ResponseStatus(HttpStatus.BAD_REQUEST)
		public @ResponseBody ErrorResponse handleException(NoSuchStudentExistsException ex) {
			return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
		}

		@ExceptionHandler(value =  StudentAlreadyExistException.class)
		@ResponseStatus
		public @ResponseBody ErrorResponse handleException(StudentAlreadyExistException ex) {
			return new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
		}

}
