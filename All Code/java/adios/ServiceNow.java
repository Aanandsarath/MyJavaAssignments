package adios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev242606.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("v^S8PbUx1J^k");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow s = new Shadow(driver);
		Thread.sleep(3000);
		WebElement all = s.findElementByXPath("//div[text()='All']");
		all.click();
		s.findElementByXPath("//input[@id='filter']").sendKeys("Service Catalog",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		

	}

}
