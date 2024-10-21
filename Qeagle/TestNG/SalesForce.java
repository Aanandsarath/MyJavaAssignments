package testngadios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SalesForce extends ProjectSpecificMethod {
   @Test
	public void Salesforce() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", opp);
		driver.findElement(By.xpath("//div[text()='New']")).click();
        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation By Aanand Sarath");
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String ver = driver.findElement(By.xpath("//slot[@name='primaryField']//lightning-formatted-text[1]")).getText();
		if (ver.contains("Aanand")) {
			System.out.println("The Account is created");
		} else {
			System.out.println("The Account is not created");
		}

	}

}
