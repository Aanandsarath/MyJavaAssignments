package runner;

import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateOpportunity_TC002 extends ProjectSpecificMethod{
	
	@Test
	public void runner() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername().
		enterPassword().
		clickOnLogin().
		clickOnWaffleButton().
		clickonViewAll().
		clickOnSales().
		clickOnOppTab().
		clickonnew().
		entername().
		enteramount().
		selectdate().
		selectstage().
		clickonSave().
		verifyOpp();
	}

}
