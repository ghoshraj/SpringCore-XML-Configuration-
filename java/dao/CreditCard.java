package dao;

public class CreditCard implements Ipayment{
	
	public CreditCard() {
		System.out.println("credit");
	}

	@Override
	public boolean processPayment(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit card payment done");
		return true;
	}

}
