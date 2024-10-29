package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement source = driver.findElement(By.id("form:drag_content"));
		WebElement target = driver.findElement(By.id("form:drop"));
		Actions opt = new Actions(driver);
		opt.dragAndDrop(source, target).perform();

	}

}
