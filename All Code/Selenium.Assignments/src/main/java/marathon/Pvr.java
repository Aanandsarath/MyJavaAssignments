package marathon;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pvr {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com");
		driver.findElement(By.className("cinemas-inactive")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Select Cinema')]")).click();
		driver.findElement(By.className("p-dropdown-item")).click();
       // driver .findElement(By.linkText("Select Date")).click();
//driver.findElement(By.id("p-dropdown-trigger")).click();
          Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		
		//driver.findElement(By.className("p-dropdown-trigger")).click();
		
		driver.findElement(By.xpath("//span[text()='MAZHAI PIDIKKATHA MANITHAN']")).click();
		
		//driver.findElement(By.linkText("Select Timing")).click(); 
		
		driver.findElement(By.xpath("//span[text()='12:30 PM']")).click();
		//Webelement


		driver.findElement(By.xpath("//span[text()=\"Book\"]")).click();
		driver.findElement(By.xpath("//button[text()= \"Accept\"]")).click();
		driver.findElement(By.xpath("(//span[@class = \"seat-current-pvr\"])[1]")).click();

		driver.findElement(By.xpath("//button[text() = \"Proceed\"]")).click();
		
		String summary = driver.findElement(By.className("movies-summary")).getText();
		System.out.println(summary);
		
		String seat = driver.findElement(By.xpath("//div[@class =\"seat-info\"]")).getText();
		System.out.println(seat);
		
		String grandamount = driver.findElement(By.xpath("//div[@class =\"grand-amount\"]")).getText();
		System.out.println(grandamount);


		
		driver.findElement(By.xpath("//button[text() = \"Proceed\"]")).click();


	}

}
