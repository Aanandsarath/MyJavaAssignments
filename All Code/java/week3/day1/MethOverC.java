package week3.day1;

public class MethOverC extends MethOverP {
	public void openURL() {
		System.out.println("www.google.com");
	}
	public static void main(String[] args) {
		MethOverC movc = new MethOverC();
		movc.openURL();

	}

}
