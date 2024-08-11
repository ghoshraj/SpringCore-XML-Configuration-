package dao;

public class PaymentService {
	
	public PaymentService() {
		System.out.println("done");
	}

	private Ipayment payment;
	
	public PaymentService(Ipayment payment) {
		this.payment = payment;
	}
	
	public void setpayment(Ipayment payment) {
		System.out.println("seeter");
		this.payment = payment;
	}
	
	public void dopayment(Double amount) {
		boolean status = payment.processPayment(amount);
		
		if(status)
			System.out.println("payment done");
		else
			System.out.println("payment is not done");
	}
}
