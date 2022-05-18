package com.maq.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.maq.entity.StockPrice;
import com.maq.repository.StockPriceRepository;

@RestController
public class StockPriceRestController {

	@Autowired
	private StockPriceRepository repo;
	
	@Autowired
	private Environment env;

	@GetMapping("/price/{companyName}")
	public ResponseEntity<StockPrice> getStockPrice(@PathVariable String companyName) {
		StockPrice stockPriceObj = repo.findByCompanyName(companyName);
		Double companyPrice = stockPriceObj.getCompanyPrice();
		String port = env.getProperty("server.port");
		stockPriceObj.setPortNumber(port);
		return new ResponseEntity<StockPrice>(stockPriceObj, HttpStatus.OK);
	}

}
