package com.maq.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maq.binding.Passenger;
import com.maq.binding.Ticket;
import com.maq.service.TicketService;

@RestController
public class TicketRestController {

	@Autowired
	private TicketService service;

	@PostMapping(value = "/ticket", produces = { "application/json" }, 
			consumes = { "application/json" })
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger) {
		System.out.println(passenger);
		Ticket ticket = service.bookTicket(passenger);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}

	@GetMapping(value = "/ticket/{ticketNum}", produces = { "application/json" })
	public ResponseEntity<Ticket> getTicket(@PathVariable String ticketNum) {
		Ticket ticket = service.getTicket(ticketNum);
		return new ResponseEntity<>(ticket, HttpStatus.OK);
	}

}
