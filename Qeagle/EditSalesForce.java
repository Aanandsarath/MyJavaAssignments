package adios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditSalesForce {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", opp);
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Salesforce Automation By Aanand Sarath",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table/tbody/tr/td[8]/span/div")).click();
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='10']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
		driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
		WebElement DandI = driver.findElement(By.xpath("//button[@aria-label='Delivery/Installation Status']"));
		executor.executeScript("arguments[0].click();", DandI);
		driver.findElement(By.xpath("//span[@title='In progress']")).click();
		driver.findElement(By.xpath("//textarea[contains(@class,'textarea')]")).sendKeys("Salesforce");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String text = driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]/span/span[text()='Perception Analysis']")).getText();
		if (text.contains("Perception")) {
			System.out.println("Stage Name is Verified");
		}else {
			System.out.println("Stage Name is not Verified");
		}
		////span[text()='Perception Analysis']
		}
}