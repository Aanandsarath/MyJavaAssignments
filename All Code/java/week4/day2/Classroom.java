package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Classroom {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions chrome=new ChromeOptions();
		chrome.addArguments("---disable-notifications");
		ChromeDriver driver  = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.snapdeal.com/");
		WebElement mo1 = driver.findElement(By.xpath("//span[@class='catText']"));
		WebElement shirts = driver.findElement(By.xpath("//span[text()='Shirts']"));
		Actions opt = new Actions(driver);
		opt.moveToElement(mo1).perform();
		shirts.click();
		WebElement mo2 = driver.findElement(By.xpath("//div[@class='product-tuple-image ']//a"));
		opt.moveToElement(mo2).perform();
		WebElement Qv = driver.findElement(By.xpath("//div[contains(text(),'Quick')]"));
		Qv.click();
		Thread.sleep(4000);
		File ss = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snapshots/snapdeal1.jpeg");
		FileUtils.copyFile(ss, dest);
	}

}
