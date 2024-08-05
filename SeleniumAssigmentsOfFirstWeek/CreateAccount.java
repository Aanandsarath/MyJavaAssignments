package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Aanand Sarath");
		driver.findElement(By.xpath("//span[text()='Description']/following::textarea[1]")).sendKeys("Selenium Automation Tester");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select ind = new Select(industry);
		ind.selectByIndex(3);
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select own = new Select(ownership);
		own.selectByVisibleText("S-Corporation");
		WebElement markcampaign = driver.findElement(By.id("marketingCampaignId"));
		Select mark = new Select(markcampaign);
		mark.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select pro = new Select(state);
		pro.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String Accname = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println(Accname);
		if(Accname.contains("Aanand Sarath")) {
			System.out.println("Account created successfully, Account Name is : "+Accname);
		} else {
			System.out.println("Error creating account");
		}
		

	}

}
