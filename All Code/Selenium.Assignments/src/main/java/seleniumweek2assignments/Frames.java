package seleniumweek2assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("The Text present in the Alert is : " +text);
		alert.accept();
		String demo = driver.findElement(By.id("demo")).getText();
		if (demo.contains("OK")) {
			System.out.println("Text is Verified");
			
		} else {
			System.out.println("Not Verified");
		}
        driver.close();
	}

}
