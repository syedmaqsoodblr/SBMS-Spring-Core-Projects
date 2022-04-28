package com.maq.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {
	
	private Integer ticketId;
	private String from;
	private String to;
	private Double price;
	private String jdate;
	private Integer trainNum;	

}
