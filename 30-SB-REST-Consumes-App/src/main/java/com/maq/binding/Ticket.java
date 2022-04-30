package com.maq.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {
	private String id;
	private Integer price;
}
