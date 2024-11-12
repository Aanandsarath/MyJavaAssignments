package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickTypes {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://my.aidaform.com/signup");
		driver.manage().window().maximize();	
		driver.findElement(By.name("nickname")).sendKeys("Walter White");
		driver.findElement(By.name("email")).sendKeys("aanandsarath18899@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("notjustyour1to0");
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("notjustyour1to0");
		Actions actions = new Actions(driver);
	    WebElement checkbox = driver.findElement(By.xpath("(//*[local-name()='svg'])[4]"));
	    actions.moveToElement(checkbox).click().perform();
	    WebElement subbutton = driver.findElement(By.xpath("//button[contains(text(),'Create')] "));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(subbutton)).click();
	    driver.close();
	}

}
