package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class StaticSalesforce {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//button[@title='App Launcher']//div")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		WebElement moveto = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		act.moveToElement(moveto).perform();
		Thread.sleep(3000);
		moveto.click();
		driver.findElement(By.className("forceActionLink")).click();
		driver.findElement(By.xpath("//input[@name=\"CompanyName\"]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		driver.findElement(By.xpath("(//div[contains(@class,'slds-form-element__control')])[11]")).click();

		
	}

}
