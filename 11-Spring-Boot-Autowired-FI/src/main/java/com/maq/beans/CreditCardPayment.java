package com.maq.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("credit")
public class CreditCardPayment implements IPayment {

	@Override
	public void payBill(double amount) {
		System.out.println("Bill paid through Credit card");
	}

}
