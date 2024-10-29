package week3.day1;

public class MethodOverloading {
	public void data() {
		System.out.println();

	}
	public void data(int version, String name) {
		System.out.println("The version of the browser is : " +version+ " The name of the browser is :  " +name);

	}
	public void data(String mode,boolean status) {
		System.out.println("The browser is in " +mode+ " The status of the browser is opened "+status);

	}

	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		mol.data();
		mol.data(2, "Chrome");
		mol.data("Incognito", true);

	}

}
