package com.maq.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = { ArithmeticException.class })
	public ResponseEntity<ApiError> handleArithematicExpection(ArithmeticException ae) {
		String expMsg = ae.getMessage();
		String expCode = "Exp101";

		ApiError error = new ApiError();
		error.setMsg(expMsg);
		error.setCode(expCode);

		return new ResponseEntity<ApiError>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = { NoCustomerFoundException.class })
	public ResponseEntity<ApiError> handleNoCustomerFoundException(NoCustomerFoundException ncfe) {
		String expMsg = ncfe.getMessage();
		String expCode = "Exp102";

		ApiError error = new ApiError();
		error.setMsg(expMsg);
		error.setCode(expCode);

		return new ResponseEntity<ApiError>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
