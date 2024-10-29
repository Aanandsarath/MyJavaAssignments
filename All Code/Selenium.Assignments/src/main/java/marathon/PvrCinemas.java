package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PvrCinemas {

	public static void main(String[] args) {
		ChromeOptions ChrOpt = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(ChrOpt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ChrOpt.addArguments("---disable notifications");
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//div[@class='date-show']/span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
        driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[contains(text(),'INOX National')]")).click();
        driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[contains(text(),'Tomorrow')]")).click();
        driver.findElement(By.xpath("//li[@class='p-dropdown-item']//span[text()='MAZHAI PIDIKKATHA MANITHAN']")).click();
        driver.findElement(By.xpath("//span[text()='07:00 PM']")).click();
        driver.findElement(By.xpath("//button[@type='submit']/span[text()='Book']")).click();
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
        driver.findElement(By.xpath("//td[@class='seats-col']/span[text()='13']")).click();
        driver.findElement(By.xpath("//div[@class='register-btn']/button[text()='Proceed']")).click();
        String summary = driver.findElement(By.className("movies-summary")).getText();
        System.out.println("The Summary of this Movie ticket is : "+summary);
        String ticinf = driver.findElement(By.className("seat-info")).getText();
        System.out.println("The Ticket Info is : " +ticinf);
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
        String title = driver.getTitle();
        System.out.println("The Title of the page is : "+title);
        driver.close();
	}

}
