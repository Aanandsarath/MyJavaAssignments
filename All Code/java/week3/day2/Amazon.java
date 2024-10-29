package week3.day2;

public class Amazon extends CanaraBank {

	@Override
	public void upiPayments() {
		System.out.println("UPI Payment Option");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking option");
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("Payment Details has been recorded");
		
	}
    public static void main(String[] args) {
    	Amazon PM = new Amazon();
    	PM.cashonDelivery();
    	PM.cardPayments();
    	PM.upiPayments();
    	PM.internetBanking();
    	PM.recordPaymentDetails();
	}

}
