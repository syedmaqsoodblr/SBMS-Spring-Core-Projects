package com.maq.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.maq.exception.NoCustomerFoundException;

@RestController
public class CustomerRestController {
	
	@GetMapping("/customer/{cid}")
	public ResponseEntity<String> getCustomerEmail(@PathVariable("cid") Integer customerId){
		String email = "";
		if(customerId >= 100) {
			email = "maq0971@gmail.com";
		} else
			throw new NoCustomerFoundException("Invalid Customer Id");
		
		return new ResponseEntity<String>(email, HttpStatus.OK);
	}

}
