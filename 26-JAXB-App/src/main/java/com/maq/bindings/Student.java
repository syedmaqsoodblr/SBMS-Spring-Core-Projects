package com.maq.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@XmlRootElement
public class Student {

	private int id;
	private String name;
	private long rank;
	
}
