package excelint;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProSpecMethod {
	 public ChromeDriver driver;
	 
	    @BeforeMethod 
		public void preconditions() {
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
		    driver= new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://login.salesforce.com/");

		}
	    
	    @AfterMethod
	    public void postcondtions() {
	    	driver.quit();
	    }

}
