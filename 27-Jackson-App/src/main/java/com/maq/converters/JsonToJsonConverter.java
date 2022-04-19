package com.maq.converters;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maq.binding.Student;

public class JsonToJsonConverter {

	public static void main(String[] args) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		Student student = objectMapper.readValue(new File("student.json"), Student.class);
		System.out.println(student);
	}

}
