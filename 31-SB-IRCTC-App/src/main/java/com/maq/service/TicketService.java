package com.maq.service;

import com.maq.binding.Passenger;
import com.maq.binding.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(String ticketNum);

}
