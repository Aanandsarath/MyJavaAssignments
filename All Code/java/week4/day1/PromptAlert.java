package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[contains(@class,'ui-button-text ui-c')])[6]")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("Walter White");
		String alerttext = alert.getText();
		System.out.println("The Text in the AlertBox is : "+alerttext);
		alert.dismiss();
		String text = driver.findElement(By.id("confirm_result")).getText();
		if (text.contains("cancel")) {
			System.out.println(text+ " is verified");	
		}else {
			System.out.println("Its not verified");
		}
		driver.close();
	}

}
