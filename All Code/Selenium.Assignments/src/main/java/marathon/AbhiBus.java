package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbhiBus {

	public static void main(String[] args) {
		ChromeOptions ChrOpt = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(ChrOpt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ChrOpt.addArguments("---disable notifications");
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//div[@class=' col']/input")).sendKeys("Chennai");
		driver.findElement(By.xpath("/html/body/main/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/ul/li[1]")).click();

	}

}
