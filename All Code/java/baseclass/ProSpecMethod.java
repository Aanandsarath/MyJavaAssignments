package baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProSpecMethod extends AbstractTestNGCucumberTests {
	 public static ChromeDriver driver;
	 
	 
	 @BeforeMethod
	 public void precondtion() {
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

		@AfterMethod
	  public void postcondition() {
		    driver.close();
	 
}
}
