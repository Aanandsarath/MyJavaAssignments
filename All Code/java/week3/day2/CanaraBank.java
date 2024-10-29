package week3.day2;

public abstract class CanaraBank implements Payments {

	@Override
	public void cashonDelivery() {
		System.out.println("Cash on Delvery Option");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payment Option");
		
	}
	
	public abstract void recordPaymentDetails();
}