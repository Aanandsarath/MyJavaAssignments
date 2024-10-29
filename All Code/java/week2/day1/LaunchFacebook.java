package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchFacebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("aanandsarath18899@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Asarath@2008");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		if(title.contains("Facebook")) {
			System.out.println("Logged IN successfully");
		}else {
			System.out.println("Unable to Login");
		}

	}

}
//Thread.sleep(10000);
//driver.close();
//To Open DOM:
//
//1. Right Click on webpage -> click on inspect
//2. press f12 or fn+f12
//3. more tools-> click on Developers tool or ctrl+shift+i