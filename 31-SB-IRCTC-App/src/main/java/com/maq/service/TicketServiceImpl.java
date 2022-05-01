package com.maq.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.maq.binding.Passenger;
import com.maq.binding.Ticket;

@Service
public class TicketServiceImpl implements TicketService{

	private Map<String, Ticket> ticketsMap = new HashMap<>();
		
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		String ticketNum = UUID.randomUUID().toString().replace("-", "");
		
		Ticket tinfo = new Ticket();
		tinfo.setTicketNum(ticketNum);
		tinfo.setTicketStatus("Confirm");
		tinfo.setTicketPrice(500.00);
		tinfo.setName(passenger.getName());
		tinfo.setFrom(passenger.getFrom());
		tinfo.setTo(passenger.getTo());
		tinfo.setJourneyDate(passenger.getJourneyDate());
		tinfo.setTrainNumber(passenger.getTrainNumber());
		tinfo.setEmail(passenger.getEmail());
		
		ticketsMap.put(ticketNum,tinfo);
				
		return tinfo;
	}
	
	@Override
	public Ticket getTicket(String ticketNum) {
		if(ticketsMap.containsKey(ticketNum)) {
			return ticketsMap.get(ticketNum);
		}
		return null;
	}

}
