package com.maq.converters;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maq.binding.Student;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {
		Student student = new Student();
		student.setSid(101);
		student.setName("Syed");
		student.setRank(32432);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = objectMapper.writeValueAsString(student);
		System.out.println(jsonString);
		objectMapper.writeValue(new File("student.json"), student);
		System.out.println("JSON File Created...");
		
	}

}
