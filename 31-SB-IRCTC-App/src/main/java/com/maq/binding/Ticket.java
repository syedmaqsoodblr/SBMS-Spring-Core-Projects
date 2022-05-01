package com.maq.binding;

import lombok.Data;

@Data
public class Ticket {
	private String name;
	private String email;
	private String from;
	private String to;
	private String journeyDate;
	private Long trainNumber;
	private String ticketNum;
	private String ticketStatus;
	private Double ticketPrice;
}
