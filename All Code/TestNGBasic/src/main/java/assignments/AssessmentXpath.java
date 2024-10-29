package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssessmentXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.cartify.pk/");
		driver.findElement(By.xpath("//span[text()='Shop By Categories']")).click();
		driver.findElement(By.xpath("(//div[@class='collection-grid-item__title h3'])[3]")).click();
		WebElement element = driver.findElement(By.xpath("//a[contains(@class,'grid-view-item__link ')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//button[@name='add']")).click();
		Thread.sleep(3000);
		WebElement cart = driver.findElement(By.xpath("//a[contains(text(),'cart')]"));
		executor.executeScript("arguments[0].click();", cart);
		Thread.sleep(3000);
		String subtotal = driver.findElement(By.xpath("//span[@class='cart-subtotal__price']")).getText();
		System.out.println("The Subtotal of the product is :  "+subtotal);
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
