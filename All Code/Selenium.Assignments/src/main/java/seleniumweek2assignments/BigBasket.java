package seleniumweek2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();		
		Thread.sleep(3000);
		WebElement mo1 = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(mo1).perform();
		WebElement mo2 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		act.moveToElement(mo2).perform();
		WebElement click1 = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		click1.click();
		WebElement brandbbroyal = driver.findElement(By.id("i-BBRoyal"));
		act.scrollToElement(brandbbroyal).perform();
		brandbbroyal.click();
		driver.findElement(By.xpath("(//div[@class='break-words h-10 w-full'])[3]")).click();
	}

}