package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys("dilip@testleaf.com");
//      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testleaf@2024");
        driver.findElement(By.xpath("(//input[contains(@class,' mb16 mt8 ')])[2]")).sendKeys("testleaf@2024");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

}


