package com.maq.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maq.binding.Ticket;

@RestController
public class TicketRestControlller {

	@GetMapping(value = "/ticket/{ticketId}", produces = { "application/xml", "application/json" })
	public ResponseEntity<Ticket> getTicket(Integer ticketId) {
		Ticket ticket = new Ticket();
		ticket.setFrom("Bangalore");
		ticket.setTo("Chennai");
		ticket.setPrice(1000.00);
		ticket.setTrainNum(1234);

		return new ResponseEntity<>(ticket, HttpStatus.OK);

	}

}
