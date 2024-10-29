package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/button.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	Thread.sleep(5000);
	//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.  
	
String element = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).getText();
if(element.contains("Disabled"))
{
	System.out.println("The button is :" +element);
}
else
{
	System.out.println("The button is not disabled");

}
//Find and print the position of the button with the text ‘Submit.’ 

WebElement element2 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
Point location = element2.getLocation();
System.out.println("The position of the submit button is: " +location);
	
	
//Find and print the background color of the button with the text ‘Find the Save button color.’ 
	
WebElement element3 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
String bgcolor = element3.getCssValue("color");
System.out.println("Find the background color of the button : " +bgcolor);

//Find and print the height and width of the button with the text ‘Find the height and width of this button.’

WebElement element4 = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']"));
Dimension size = element4.getSize();
System.out.println("Find the height and width of this button: " +size);

//Click on the button with the text ‘Click and Confirm title.’ 

	driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
	
	//Verify that the title of the page is ‘dashboard.’ 
	
	String title = driver.getTitle();
	if(title.contains("Dash"))
	{
		System.out.println("Correct Page Title: " +title);
	}
	else
	{
		System.out.println("Incorrect Page Title");
	}
	driver.close();

	}}
