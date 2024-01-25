package com.example.demo.exception.global;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.ExceptionResponse;
import com.example.demo.exception.UserNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandling {
	@ExceptionHandler(UserNotFoundException.class)
	public ExceptionResponse handlerUserNotFoundException(UserNotFoundException ex) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(), new Date(),
				String.valueOf(HttpStatus.NOT_FOUND.value()));
		return exceptionResponse;
	}

}
