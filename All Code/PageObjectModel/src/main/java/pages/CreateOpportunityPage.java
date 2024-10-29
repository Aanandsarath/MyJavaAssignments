package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecificMethod;

public class CreateOpportunityPage extends ProjectSpecificMethod {
	
	public CreateOpportunityPage(ChromeDriver driver) {
		this.driver=driver;
	}
    public CreateOpportunityPage clickonnew() {
    	driver.findElement(By.xpath("//div[text()='New']")).click();
		return this;
    }
    
    public CreateOpportunityPage entername() {
        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation By Aanand Sarath");
		return this;
    }
    
    public CreateOpportunityPage enteramount() {
    	driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
		return this;
    }
    
    public CreateOpportunityPage selectdate() {
    	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
    	driver.findElement(By.xpath("//button[text()='Today']")).click();
		return this;
    }
    
    public CreateOpportunityPage selectstage() {
    	driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
    	driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		return this;
    }
    
    public ViewOppPage clickonSave() {
    	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
    	return new ViewOppPage(driver);
    }
    
    
    
    
    
    
    





}
