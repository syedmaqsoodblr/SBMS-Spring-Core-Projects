package in.ashokit;

public class AmexCardPayment implements IPayment {

	public AmexCardPayment() {
		System.out.println("AmexCardPayment :: Constructor");
	}

	public boolean payBill(double amt) {
		System.out.println("Bill Paid Using AmexCard...!!");
		return true;
	}
}
