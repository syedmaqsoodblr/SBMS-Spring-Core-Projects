package com.maq.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.maq.binding.StockPrice;

@FeignClient(name = "STOCK-PRICE-API")
public interface StockPriceClient {

	@GetMapping("/price/{cname}")
	public StockPrice invokeStockPrice(@PathVariable String cname);
	
}
