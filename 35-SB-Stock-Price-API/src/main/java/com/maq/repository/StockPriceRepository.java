package com.maq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maq.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Integer>{

	public StockPrice findByCompanyName(String companyName);
}
