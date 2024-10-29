package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium{

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Aanand Sarath");
	}

}
