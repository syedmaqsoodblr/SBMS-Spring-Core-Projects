package com.maq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.maq.entity.Student;
import com.maq.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository studentRepo = context.getBean(StudentRepository.class);
		
		Student s = new Student();
//		s.setSid(101);
		s.setSname("Raju");
//		s.setSrank(435);
		s.setSrank(425);
		
		studentRepo.save(s);
		System.out.println("Done...");
		
	}

}
