package javaweek3assignments;

public class MethOverSubClass extends MethOverSupClass {
	
	public void payment(String NetBanking, String EMI, String Coupon) {
		System.out.println("The First Option is : "+NetBanking);
		System.out.println("The First Option is : "+EMI);
		System.out.println("The First Option is : "+Coupon);

	}

	public static void main(String[] args) {
		 MethOverSubClass movsb = new MethOverSubClass();
		 movsb.payment("Netbanking : cost = 25","EMI : 1 month = 1234","Coupon : ADVCGFDH");
	}

}
