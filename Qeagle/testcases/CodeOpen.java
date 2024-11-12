package pack1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeOpen {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://codepen.io/unknownUser7/pen/ZEdGLbq");
		driver.manage().window().maximize();
		driver.switchTo().frame("CodePen");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		alert.accept();
		String welcome = driver.findElement(By.xpath("//h1[text()='Welcome!']")).getText();
		String log = driver.findElement(By.xpath("//p[contains(text(),'logged')]")).getText();
		String message=welcome+log;
		if (message.contains("logged")) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Not Successfull");
		}
		driver.close();

	}

}
