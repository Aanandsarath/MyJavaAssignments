package seleniumweek2assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		String price = driver.findElement(By.className("a-price-whole")).getText();
		System.out.println("The Price of the mobile is : "+price);
		String reviews = driver.findElement(By.xpath("//span[contains(@class,'a-size-base s-underline-text')]")).getText();
		System.out.println("The Review of the item is : "+reviews);
		driver.findElement(By.xpath("//span[contains(text(),'OnePlus 9 Pro 5G')]")).click();
		Set<String> pw = driver.getWindowHandles();
		String hometab = driver.getTitle();
		System.out.println("Title of the First page : "+hometab);
		List<String> cw = new ArrayList<String>(pw);
		driver.switchTo().window(cw.get(1));
		String Childtab = driver.getTitle();
		System.out.println("The Title of the Second tab is : "+Childtab);
		File scrn = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./AssignmentSnapshots/Amazon.jpeg");
		FileUtils.copyFile(scrn, dest);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		String subtotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println(subtotal);
		if (subtotal.contains(price)) {
			System.out.println("The Subtotal of the Cart is : "+subtotal);
		}else {
			System.out.println("Invalid Page");
		}
		driver.quit();
		
        
        
        
	}

}
