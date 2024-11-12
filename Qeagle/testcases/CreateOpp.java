package pack1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateOpp {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Opportunities");
		driver.findElement(By.xpath("//b[text()='Opportunities']")).click();
		driver.findElement(By.xpath("//table/tbody/tr/th")).click();
		driver.findElement(By.xpath("(//span[text()='Email'])[2]")).click();
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("aanandsarath18899@gmail.com");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='CK Editor Container']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Email Body']")));
		driver.findElement(By.xpath("//body[@tabindex='0']")).sendKeys("I have completed the Selenium Challenge 13");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		driver.close();
	}

}
