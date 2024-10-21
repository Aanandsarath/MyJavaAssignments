package testngadios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WorkTypeEdit extends ProjectSpecificMethod {
@Test
	public void WTEdit() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement wt = driver.findElement(By.xpath("//p[text()='Work Type Groups']"));
		driver.executeScript("arguments[0].scrollIntoView();", wt);
		wt.click();
		driver.findElement(By.xpath("//input[@name='WorkTypeGroup-search-input']")).sendKeys("Salesforce Automation by Walter White",Keys.ENTER);
		Thread.sleep(1000);
		WebElement dropdown=driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]/span/div/a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", dropdown);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Automation");
		driver.findElement(By.xpath("//button[@aria-label='Group Type']")).click();
		driver.findElement(By.xpath("//span[@title='Capacity']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebElement clickon = driver.findElement(By.xpath("(//a[text()='Salesforce Automation by Walter White'])"));
		executor.executeScript("arguments[0].click();", clickon);
		String text = driver.findElement(By.xpath("(//slot[@name='outputField']/lightning-formatted-text)[2]")).getText();
		if (text.contains("Auto")) {
			System.out.println("The Workgroup Name is Verified");
		}else {
			System.out.println("The Workgroup Name is  not Verified");
		}
	}

}
