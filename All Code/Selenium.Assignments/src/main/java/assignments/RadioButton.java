package assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible'])[14]/following-sibling::div")).click();
        WebElement Default = driver.findElement(By.xpath("(//input[@name='j_idt87:console2'])[3]"));
        String Deftext = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).getText();
        if(Default.isSelected()) {
        	System.out.println("The Default button is Selected : " +Deftext);
        }else {
        	System.out.println("The Default Button is not Selected");
        }
        Thread.sleep(3000);
        WebElement age = driver.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible'])[24]/following-sibling::div"));
        Thread.sleep(3000);
        if (age.isEnabled()) {
			System.out.println("The Age button is selected");
		} else {
			System.out.println("The Age button is not selected");
		}
        driver.close();
}
}

