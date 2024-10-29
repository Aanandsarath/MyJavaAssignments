package week1.day2;

public class Browser {
	public String launchbrowser(String BrowserName) {
		return BrowserName;
	}
	public void loadURL() {
	    System.out.println("Application URL Loaded successfully");
	}
	public static void main(String[] args) {
		Browser Browser = new Browser();
		String A = Browser.launchbrowser("Browser launced Successfully");
		Browser.loadURL();
		System.out.println(A);
	}
}
