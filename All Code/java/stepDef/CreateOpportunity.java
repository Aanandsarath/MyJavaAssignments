package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateOpportunity {
	public ChromeDriver driver;
	public ChromeOptions options;

	@Given("Launch the browser and Load the URL")
	public void launch_the_browser_and_load_the_url() {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
	}

	@When("Enter the Username as {string}")
	public void enter_the_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@When("Enter the Password as {string}")
	public void enter_the_password_as(String passcode) {
		driver.findElement(By.id("password")).sendKeys(passcode);
	}

	@When("Click on login Button")
	public void click_on_login_button() {
		driver.findElement(By.id("Login")).click();

	}

	@When("Create Opportunity")
	public void create_opportunity() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement clickToggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		js.executeScript("arguments[0].click();", clickToggle);
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.xpath("(//button[@class='slds-button'])[2]"));
		js.executeScript("arguments[0].click();", click);
		Thread.sleep(3000);
		WebElement clickSales = driver.findElement(By.xpath("//p[text()='Sales']"));
		js.executeScript("arguments[0].click();", clickSales);
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", opp);
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@When("Enter the name as {string}")
	public void enter_the_name_as(String name) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	}

	@When("Amount as {string}")
	public void amount_as(String amount) {
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

	}

	@Then("Verify the Opportunity Name")
	public void verify_the_opportunity_name() {
		String ver = driver.findElement(By.xpath("//slot[@name='primaryField']//lightning-formatted-text[1]"))
				.getText();
		if (ver.contains("Aanand") || ver.contains("Walter") || ver.contains("Harvey")) {
			System.out.println("The Account is created");
		} else {
			System.out.println("The Account is not created");
		}

	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.close();
	}

}
