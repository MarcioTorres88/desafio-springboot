package com.marcio.Myapp.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.marcio.Myapp.services.exceptions.ObjectNotFoundException;



@ControllerAdvice
public class ResourceExceptionHandle {
	
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public  ResponseEntity<StandarError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
		StandarError error = new StandarError(HttpStatus.NOT_FOUND.value(),System.currentTimeMillis(), e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
