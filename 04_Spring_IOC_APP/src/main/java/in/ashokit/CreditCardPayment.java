package in.ashokit;

public class CreditCardPayment implements IPayment {

	public CreditCardPayment() {
		System.out.println("CreditCardPayment :: Constructor");
	}

	public boolean payBill(double amt) {
		System.out.println("Bill Paid Using CreditCard...");
		return true;
	}
}
