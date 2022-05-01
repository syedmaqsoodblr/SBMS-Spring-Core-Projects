package com.maq.binding;

import lombok.Data;

@Data
public class Passenger {
	private String name;
	private String email;
	private String from;
	private String to;
	private String journeyDate;
	private Long trainNumber;

}
