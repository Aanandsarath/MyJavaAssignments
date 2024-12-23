package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PetDisease {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://petdiseasealerts.org/");
		driver.manage().window().maximize();
		WebElement stories = driver.findElement(By.xpath("//a[text()='Stories']"));
		Actions act = new Actions(driver);
		act.moveToElement(stories).click().perform();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
