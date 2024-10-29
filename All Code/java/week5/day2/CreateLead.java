package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {
	@DataProvider(name="SendData")
	public String[][] setValue() {
		
		String[][] data = new String[3][4];
		data[0][0]="TestLeaf";
		data[0][1]="Walter";
		data[0][2]="White";
		data[0][3]="7092168100";
		
		data[1][0]="TestLeaf";
		data[1][1]="Bruce";
		data[1][2]="Wayne";
		data[1][3]="9840958933";
		
		data[2][0]="TestLeaf";
		data[2][1]="Arthur";
		data[2][2]="Morgan";
		data[2][3]="9952930932";
		return data;

	}

@Test(dataProvider = "SendData")
	public void RunCreateLead(String Cname, String Fname, String Lname, String Phnum) {

	driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Phnum);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}


	}

}
