package com.maq.exception;

public class NoCustomerFoundException extends RuntimeException {

	public NoCustomerFoundException() {
		super();
	}

	public NoCustomerFoundException(String message) {
		super(message);
	}

}
