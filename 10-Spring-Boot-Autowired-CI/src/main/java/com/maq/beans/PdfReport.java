package com.maq.beans;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReport implements IReport {

	@Override
	public void generateReport() {
		System.out.println("Generating Excel Report...");
	}

}
