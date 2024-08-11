package dao;

public class AmexCard implements Ipayment{

	@Override
	public boolean processPayment(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("Amex payment is done");
		return true;
	}

}
