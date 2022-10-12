package com.test.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Handler {
   @ExceptionHandler(org.springframework.web.HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<Object> exception(org.springframework.web.HttpRequestMethodNotSupportedException ex)
	{
		return  new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
