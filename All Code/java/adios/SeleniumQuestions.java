package adios;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumQuestions {

	public static void main(String[] args) {
		ChromeOptions options =  new ChromeOptions();
		options.addArguments("---disable-notifications");
		ChromeDriver driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://blog.testleaf.com/selenium-interview-questions/");
		List<WebElement> elements = driver.findElements(By.tagName("strong"));
		 for(WebElement texts : elements) {
               String questions = texts.getText();
               if (questions.contains("Q.")) {
				System.out.println(questions);
			}
             //  System.out.println(questions);
	            
	        }

}
}
