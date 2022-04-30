package com.maq.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maq.binding.Passenger;
import com.maq.binding.Ticket;

@RestController
public class TicketRestController2 {

	@PostMapping(value = "/ticket2", produces = { "application/json", "application/xml" }, consumes = {
			"application/json", "application/xml" })
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger) {
		System.out.println(passenger);
		Ticket ticket = new Ticket();
		ticket.setId("T101");
		ticket.setPrice(500);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}

}
