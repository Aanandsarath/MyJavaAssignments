package rough;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorkTypeEdit {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'slds-icon-waffle')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement wt = driver.findElement(By.xpath("//p[text()='Work Type Groups']"));
		driver.executeScript("arguments[0].scrollIntoView();", wt);
		wt.click();
		driver.findElement(By.xpath("//input[@name='WorkTypeGroup-search-input']")).sendKeys("Salesforce Automation by Walter White",Keys.ENTER);
		Thread.sleep(1000);
		WebElement dropdown=driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]/span/div/a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", dropdown);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Automation");
		driver.findElement(By.xpath("//button[@id='combobox-button-208']")).click();
		driver.findElement(By.xpath("//span[@title='Capacity']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebElement clickon = driver.findElement(By.xpath("(//a[text()='Salesforce Automation by Walter White'])"));
		executor.executeScript("arguments[0].click();", clickon);
		String text = driver.findElement(By.xpath("(//slot[@name='outputField']/lightning-formatted-text)[2]")).getText();
		if (text.contains("Auto")) {
			System.out.println("The Workgroup Name is Verified");
		}else {
			System.out.println("The Workgroup Name is  not Verified");
		}
	}

}
