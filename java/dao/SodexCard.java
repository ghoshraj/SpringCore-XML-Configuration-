package dao;

public class SodexCard implements Ipayment{

	@Override
	public boolean processPayment(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("Sodexo payment done");
		return true;
	}

}
