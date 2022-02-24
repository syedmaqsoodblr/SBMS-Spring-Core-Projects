package in.ashokit;

public class PaymentContext {

	private IPayment payment;

	public PaymentContext(IPayment payment) {
		System.out.println("PaymentContext :: Constructor");
		this.payment = payment;
	}

	public void payment(double amt) {

		boolean status = payment.payBill(amt);

		if (status) {
			System.out.println("Bill Receipt Generated...");
		}
	}
}