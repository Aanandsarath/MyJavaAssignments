package javaweek3assignments;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Username : Walter White");
	}
	
	public void enterPassword() {
		System.out.println("Password : Skyler007");
	}

	public static void main(String[] args) {
		LoginTestData ltd = new LoginTestData();
		ltd.enterCredentials();
		ltd.enterUsername();
		ltd.enterPassword();
		ltd.navigatetoHomePage();
	}

}
