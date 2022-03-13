package com.maq.beans;

import org.springframework.stereotype.Component;

@Component("debit")
public class DebitCardPayment implements IPayment {

	@Override
	public void payBill(double amount) {
		System.out.println("Bill paid through Debit card");
	}

}
