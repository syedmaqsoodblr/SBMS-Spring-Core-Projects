package com.maq.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.maq.bindings.Student;

public class Marshalling {
public static void main(String[] args) throws JAXBException {
	Student sobj = new Student();
	sobj.setId(101);
	sobj.setName("Syed");
	sobj.setRank(43445);
	
	JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
	Marshaller marshaller = jaxbContext.createMarshaller();
	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	marshaller.marshal(sobj, new File("student.xml"));
	marshaller.marshal(sobj, System.out);

	System.out.println("Marshalling completed...");
}
}
