package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass{
	
	@BeforeTest
	public void setData() {
		fileName = "CreateLead";
	}
	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String username, String password, String company, String firstName, String lastName) throws InterruptedException {
				
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterCompanyName(company)
		.clickCreateLeadButton()
		.verifyFirstName();

	}

}
