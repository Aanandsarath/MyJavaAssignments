package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecificMethod;

public class ViewOppPage extends ProjectSpecificMethod {
	
	public ViewOppPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public ViewOppPage verifyOpp() {
		String ver = driver.findElement(By.xpath("//slot[@name='primaryField']//lightning-formatted-text[1]")).getText();
		if (ver.contains("Aanand")) {
			System.out.println("The Account is created");
		} else {
			System.out.println("The Account is not created");
		}
		
		return this;
	}

}
