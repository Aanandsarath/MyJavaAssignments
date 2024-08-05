package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Arthur");
		driver.findElement(By.name("lastname")).sendKeys("Morgan");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("Arthur@2008");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select day1 = new Select(day);
		day1.selectByValue("18");
		WebElement month = driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		month1.selectByIndex(7);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("1999");
		driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();
		
		

	}

}
