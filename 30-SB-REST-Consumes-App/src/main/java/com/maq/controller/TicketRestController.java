package com.maq.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maq.binding.Passenger;

@RestController
public class TicketRestController {

	@PostMapping(value = "/ticket", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> bookTicket(@RequestBody Passenger passenger) {
		System.out.println(passenger);
		return new ResponseEntity<>("Ticket Booked", HttpStatus.CREATED);
	}

}
