package week4.Day1;

public class Amazon extends CanaraBank {
	
	
	@Override
	public void cashOnDelivery() {
		System.out.println("cashOnDelivery");
	}
	
	@Override
	public void upiPayments() {
		System.out.println("UPI");
	}
	
	@Override
	public void cardPayments() {
		System.out.println("payment card");
	}
	@Override
	
	public void internetBanking() {
		System.out.println("banking done");
	}
	


	public static void main(String[] args) {
	//	creating object for amaxon class
		Amazon options=new Amazon();
		options.cardPayments();
		options.cashOnDelivery();
		options.internetBanking();
		
		//calling method from super class
		
		options.recordPaymentDetails();
	}

}
