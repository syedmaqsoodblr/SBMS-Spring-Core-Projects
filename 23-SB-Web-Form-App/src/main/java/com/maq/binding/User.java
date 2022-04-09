package com.maq.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="USER_DTLS")
public class User {
	
	@Id
	@GeneratedValue
	private Integer userId;
	private String uname;
	private String email;
	private Long phno;
}
