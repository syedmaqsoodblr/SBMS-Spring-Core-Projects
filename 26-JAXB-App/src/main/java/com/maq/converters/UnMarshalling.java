package com.maq.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.maq.bindings.Student;

public class UnMarshalling {
public static void main(String[] args) throws JAXBException {
	JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
	Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	Object obj = unmarshaller.unmarshal(new File("student.xml"));
	Student sobj = (Student)obj;
	System.out.println(sobj);
}
}
