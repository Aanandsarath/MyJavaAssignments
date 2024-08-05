package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath(("(//div[@class='x-panel-header']//a)[2]"))).click();
		driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']//span[contains(text(),'Phone')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		String text = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("12488")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys("12488");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String text2 = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		if(text2.contains("No records"))
		{
			System.out.println("Record successfully deleted");
		}
		else
		{
			System.out.println("Record deletion unsuccessful");
		}
		driver.close();


	}

}
