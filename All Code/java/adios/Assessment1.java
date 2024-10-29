package adios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assessment1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.marutisuzuki.com/");
		driver.findElement(By.className("headerSearch-btn")).click();
		driver.findElement(By.name("key")).sendKeys("Swift",Keys.ENTER);
		driver.findElement(By.className("icon-general_info")).click();
		WebElement selectcity = driver.findElement(By.id("selectcity1"));
		Select dd = new Select(selectcity);
		dd.selectByVisibleText("INDI");
		driver.findElement(By.partialLinkText("SAFE")).click();
        String text = driver.findElement(By.className("caption-text")).getText();
        System.out.println("The Paragraph says that :" + " " +text);

	}

}
