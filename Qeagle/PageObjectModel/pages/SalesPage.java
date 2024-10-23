package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecificMethod;

public class SalesPage extends ProjectSpecificMethod {
	
	public SalesPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public OpportunityPage clickOnOppTab() {
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", opp);
		return new OpportunityPage(driver);
	}

}
