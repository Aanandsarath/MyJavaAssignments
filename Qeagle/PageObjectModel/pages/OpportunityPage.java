package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecificMethod;

public class OpportunityPage extends ProjectSpecificMethod {
	
	public OpportunityPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	
    public ViewOppPage createOpp() {
    	driver.findElement(By.xpath("//div[text()='New']")).click();
        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation By Aanand Sarath");
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		return new ViewOppPage(driver);
    }
}
