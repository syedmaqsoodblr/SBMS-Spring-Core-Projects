package com.maq.converters;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.maq.binding.Student;

public class GsonConverter {
	public static void main(String[] args) throws Exception {
		Gson gson = new Gson();
		Student student = new Student();
		student.setSid(101);
		student.setName("Syed");
		student.setRank(32432);

		try (FileWriter writer = new FileWriter("gsonStudent.json")) {
			gson.toJson(student, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Student studentobj = gson.fromJson(new FileReader("gsonStudent.json"), Student.class);
		System.out.println(studentobj);

	}
}
