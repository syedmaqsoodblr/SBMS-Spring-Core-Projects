package in.ashokit;

public class DebitCardPayment implements IPayment {

	public DebitCardPayment() {
		System.out.println("DebitCardPayment :: Constructor");
	}

	public boolean payBill(double amt) {
		System.out.println("Bill Paid Using Debit Card...!!");
		return true;
	}

}
