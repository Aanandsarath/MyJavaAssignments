package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[1]")).click();
		String check = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		if(check.contains("Checked")) {
			System.out.println("The Checked Message is displayed");
		} else {
			System.out.println("It's not displayed");
		}
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[3]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div/div/div[2]")).click();
		Thread.sleep(1000);		
		String TriState1 = driver.findElement(By.xpath("//p[contains(text(),'1')]")).getText();		
		if(TriState1.contains("1")) {
			System.out.println("The State has been changed to " +TriState1);
		}else if(TriState1.contains("2")){
			System.out.println("The State has been changed to " +TriState1);
		}else if(TriState1.contains("0")){
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div/div/div[2]")).click();
			System.out.println("The State has been changed to " +TriState1+ " Hence the Checkbox is not selected");
		}
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		String text1 = driver.findElement(By.className("ui-growl-item")).getText();
		if(text1.contains("Checked")){
			System.out.println("The 'Checked' Alert Checkbox is displayed ");
		}else if(text1.contains("Unchecked")) {
			System.out.println("The 'Unchecked' Alert Checkbox is displayed");
		}
		boolean disabledcheckbox = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).isEnabled();
		System.out.println(disabledcheckbox);
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();	
		driver.findElement(By.xpath("//label[text()='Miami']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='London']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Berlin']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Barcelona']/preceding-sibling::div")).click();
		Thread.sleep(7000);
		driver.close();
	}

	}



