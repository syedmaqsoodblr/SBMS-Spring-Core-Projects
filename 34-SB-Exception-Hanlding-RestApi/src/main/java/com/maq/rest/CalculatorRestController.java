package com.maq.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maq.exception.ApiError;

@RestController
public class CalculatorRestController {

	@GetMapping("/sum")
	public String sum() {
		Integer a = 10;
		Integer b = 20;

		Integer result = a + b;

		return "Result : " + result;

	}

	@GetMapping("/div")
	public String div() {
		Integer a = 10;
		Integer b = 0;

		Integer result = a / b;

		return "Result : " + result;

	}

}
