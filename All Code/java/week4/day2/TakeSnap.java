package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnap {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://login.salesforce.com/?locale=in");
		WebElement login = driver.findElement(By.id("Login"));
		//Step 1 - Take a Snap
		File scrn = driver.getScreenshotAs(OutputType.FILE);
		//Step 2 - Create a Destination
		File dest = new File("./Snapshots/img2.jpeg");
		//Step 3 - Link Snap and its Destination using FileUtils
		FileUtils.copyFile(scrn, dest);
		//Take a screenshot of a particular button or place. Inspect the and element put it in the Local Variable and instead of driver in Step 1 put the local variable.get screenshit as
		File scrn1 = login.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Particular Element/img1.jpeg");
		FileUtils.copyFile(scrn1, dest1);
		driver.close();
	}

}
