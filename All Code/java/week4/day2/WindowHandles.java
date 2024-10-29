package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {

	public static void main(String[] args) {
		ChromeOptions options =  new ChromeOptions();
		options.addArguments("---disable-notifications");
		ChromeDriver driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		String homepage = driver.getTitle();
		System.out.println("Title of the Parent page is : "+homepage);
		List<String> swi = new ArrayList<String>(windowHandles);
		String flightwindowtitle = driver.switchTo().window(swi.get(1)).getTitle();
		System.out.println("The Title of the Child Tab is : "+flightwindowtitle);
		driver.findElement(By.id("stationFrom")).click();
		driver.switchTo().window(swi.get(0));
		driver.close();
		driver.switchTo().window(swi.get(1));
		if (flightwindowtitle.contains("Flight")) {
			System.out.println("IRCTC Next Generation eTicketing System tab is closed");	
		}else {
			System.out.println("IRCTC Next Generation eTicketing System not closed yet");
		}
		

	}

}
