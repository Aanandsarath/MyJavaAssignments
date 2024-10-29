package adios;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Telerik{


	public static void main(String[] args) {
	
//1. Launch the browser and Load Url as https://www.telerik.com/contact 	
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.telerik.com/contact");

//2.Select "Invoicing/Billing" from the first dropdown using selectByValue
WebElement dd=driver.findElement(By.name("DropdownListFieldController_0"));
		Select obj= new Select(dd);
obj.selectByValue("Invoicing/Billing");

//3.Choose “Testing Framework” from the dropdown 
WebElement aa=driver.findElement(By.name("DropdownListFieldController"));
		Select obj1= new Select(aa);
obj1.selectByVisibleText("Testing Framework"); 

//4.Enter ‘Your First Name’ in the first name field 
driver.findElement(By.name("TextFieldController")).sendKeys("Aanand");

//5.Enter ‘Your Last Name’ in the last name field 
driver.findElement(By.name("TextFieldController_0")).sendKeys("Sarath");

//6. Select United States in the dropdown using Select by index method
WebElement country = driver.findElement(By.name("DynamicListFieldController"));
Select obj3 = new Select(country);
obj3.selectByIndex(1);

//7.Enter ‘Your Business Name ’ in the Business Name field
driver.findElement(By.name("EmailTextFieldController")).sendKeys("Walterwhite@gmail.com");

//8.Enter ‘Your Company Name’ in the Company Name field
driver.findElement(By.name("TextFieldController_1")).sendKeys("Qeagle");

//9.Enter ‘Your Phone Number’ in the Phone Number field
driver.findElement(By.name("TextFieldController_2")).sendKeys("7092168100");

//10.Quit the driver
driver.quit();

}

}