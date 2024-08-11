package dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		PaymentService service = context.getBean(PaymentService.class);
		
		service.dopayment(100.00);
	}
}
