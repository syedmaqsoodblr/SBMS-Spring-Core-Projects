package com.maq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.maq.beans.IReport;

@Service
public class ReportService {

	private IReport report;
	
	@Autowired
	public ReportService(@Qualifier("excel") IReport report) {
		this.report = report;
		System.out.println(this.getClass().getName());
	}
	
	public void downloadReport() {
		report.generateReport();
		System.out.println("Download started...");
	}

}
