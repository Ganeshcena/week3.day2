package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{
	
	
	@BeforeTest
	public void setData() {
		fileName = "Login";
	}

	
	@Test(dataProvider = "sendData")
	public void runLogin(String username,String password) throws InterruptedException {
		
		
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.verifyHomePage();
		

	}

}
