package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintListOfWebElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int size = elements.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
		System.out.println(elements.get(i).getText());		
		}

	}

}
