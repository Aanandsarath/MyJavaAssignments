package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		ChromeOptions chrome=new ChromeOptions();
		chrome.addArguments("---disable-notifications");
		ChromeDriver driver  = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ajio.com/");
		WebElement mo = driver.findElement(By.xpath("//span[text()='MEN']"));
		Actions opt = new Actions(driver);
		opt.moveToElement(mo).perform();

	}

}
