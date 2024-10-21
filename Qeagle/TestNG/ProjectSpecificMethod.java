package testngadios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
 public ChromeDriver driver;
 
    @BeforeMethod 
	public void preconditions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
	    driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@2024");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
    
    @AfterMethod
    public void postcondtions() {
    	driver.quit();
    }

}
