package com.maq.binding;

import lombok.Data;

@Data
public class Ticket {
	
	private String email;
	private String from ;
	private String jdate;
	private String name;
	private String to;
	private Integer trainNum;
	private Integer ticketPrice;
	private String ticketNum;
	private String ticketStatus;
	
}
