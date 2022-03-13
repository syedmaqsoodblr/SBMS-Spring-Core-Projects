package com.maq.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.maq.beans.IPayment;

@Service
public class PaymentContext {

	@Autowired
	@Qualifier("debit")
	public IPayment payment;
	
	public void pay(double amt) {
		payment.payBill(amt);
	}

}
