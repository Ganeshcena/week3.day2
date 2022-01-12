package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.MyLeadsPage;

public class CreateLead2 extends BaseClass{
	
	@BeforeTest
	public void setData() {
		fileName = "CreateLead2";
	}
	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String company, String firstName, String lastName) throws InterruptedException {
				
		new MyLeadsPage(driver)
		.clickCreateLeadLink()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterCompanyName(company)
		.clickCreateLeadButton()
		.verifyFirstName();
	}

}
