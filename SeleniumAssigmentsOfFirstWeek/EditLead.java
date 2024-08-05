package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args)
	{
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABCD Pvt.Ltd");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Harvey");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Specter");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Kendrick");
	driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
	driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("Waltervetrivel@gmail.com");
	driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
	WebElement element = driver.findElement(By.xpath("//select[@name= 'generalStateProvinceGeoId']"));
	Select option = new Select(element);
	option.selectByVisibleText("New York");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.xpath("//textarea[@class='inputBox']")).clear();
	driver.findElement(By.name("importantNote")).sendKeys("Beware of Gold");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	String title = driver.getTitle();
	System.out.println("The title of the current page is : " +title );
	driver.close();
	}

}
