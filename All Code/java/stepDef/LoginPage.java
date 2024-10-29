package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProSpecMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProSpecMethod {

//	@Given("Open the browser and Load the URL")
//	public void open_the_browser_and_load_the_url() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	}
	@When("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	@When("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	@When("Click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Verify Login is successful")
	public void verify_login_is_successful() {
String title = driver.getTitle();
if (title.contains("Test")) {
	System.out.println("Login is successful");
} else {
	System.out.println("Login not successful");
}

	}
	
	@Then("Verify Login is not successful")
	public void invalidlogin() {
		String title = driver.getTitle();
		if (title.contains("Test")) {
			System.out.println("Login is successful");
		} else {
			System.out.println("Login is not successful");
		}
	}
//	@Then("Close the Browser")
//	public void closeBrowser() {
//		driver.close();
//	}
}
