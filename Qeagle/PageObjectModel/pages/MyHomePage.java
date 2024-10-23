package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	 
	public MyHomePage clickOnWaffleButton() {
		WebElement waffle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", waffle);
		return this;
	}
	
	public MyHomePage clickonViewAll() {
		WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", viewAll);
		return this;
	}
	public SalesPage clickOnSales() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		return new SalesPage(driver);
	}

}
