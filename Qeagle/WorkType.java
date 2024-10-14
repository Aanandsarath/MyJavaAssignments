package adios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorkType {

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
		WebElement wt = driver.findElement(By.xpath("//p[text()='Work Type Groups']"));
		driver.executeScript("arguments[0].scrollIntoView();", wt);
		wt.click();
		WebElement smalldd = driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']//span//lightning-primitive-icon"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", smalldd);
		WebElement nw = driver.findElement(By.xpath("//span[text()='New Work Type Group']"));
		executor.executeScript("arguments[0].click();", nw);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Walter White");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String text = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		if (text.contains("Walter")) {
			System.out.println("The Workgroup Name is Verified");
		}else {
			System.out.println("The Workgroup Name is  not Verified");
		}
	}

}
