package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		ChromeOptions ChrOpt = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(ChrOpt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ChrOpt.addArguments("---disable notifications");
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("(//div[@class='s-suggestion-container']/div[contains(text(),'bags for boys')])[1]")).click();
		String results = driver.findElement(By.className("sg-col-inner")).getText();
		System.out.println(results);
		driver.findElement(By.xpath("//span[text()='Brands']/following::i[1]")).click();
		driver.findElement(By.xpath("//span[text()='Brands']/following::i[2]")).click();	
	    driver.findElement(By.id("a-autoid-0-announce")).click();
	    driver.findElement(By.xpath("(//a[@class='a-dropdown-link'])[4]")).click();
	   String info = driver.findElement(By.xpath("(//div[@class='sg-col-inner']//span[@class='a-declarative'])[1]")).getText();
	   System.out.println("The Information of the bag is : "+info);
	   String title = driver.getTitle();
	   System.out.println("The Title of the Page is : "+title);
	   driver.close();

	}

}
