package dao;

public class DebitCard implements Ipayment{
    public DebitCard() {
    	System.out.println("debit");
    }

	@Override
	public boolean processPayment(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("Debit card payment done");
		return true;
	}

}
