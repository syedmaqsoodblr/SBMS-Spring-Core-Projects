package com.maq.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.maq.binding.StockPrice;
import com.maq.client.StockPriceClient;

@RestController
public class StockCalcRestController {

	@Autowired
	private StockPriceClient priceClient;
	
	@GetMapping("/calc/{cname}/{qty}")
	public ResponseEntity<String> calculate(@PathVariable String cname, @PathVariable Integer qty){
		/* String url = "http://localhost:1111/price/{cname}";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<StockPrice> responseEntity = restTemplate.getForEntity(url, StockPrice.class, cname);
		StockPrice body = responseEntity.getBody();
		Double companyPrice = body.getCompanyPrice(); */
		
		StockPrice stockPrice = priceClient.invokeStockPrice(cname);
		Double companyPrice = stockPrice.getCompanyPrice();
		String portNumber = stockPrice.getPortNumber();
		
		Double totalCost = companyPrice * qty;
		String msg = "Total Cost : " + totalCost
				+ "(Price api Server port :: " + portNumber + " )";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
}
