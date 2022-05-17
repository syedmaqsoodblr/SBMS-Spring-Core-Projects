package com.maq.exception;

import lombok.Data;

@Data
public class ApiError {
 
	private String msg;
	private String code;
}
