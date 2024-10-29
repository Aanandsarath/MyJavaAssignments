package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		WebElement scroll = driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
		Actions opt = new Actions(driver);
		opt.scrollToElement(scroll).perform();
		Thread.sleep(3000);
		scroll.click();

	}

}
