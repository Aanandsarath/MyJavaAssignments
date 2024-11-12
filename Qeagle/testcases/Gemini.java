package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gemini {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://gemini.google.com/");
		driver.manage().window().maximize();
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign in']"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", signin);
		String title = driver.getTitle();
		System.out.println(title);

	}

}
