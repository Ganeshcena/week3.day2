package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class HomePage extends BaseClass{
	

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	
	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage(driver);
	}
	
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new LoginPage(driver);
	}
	
	public HomePage verifyHomePage() {
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
			
		return this;
		
	}
	
	

}
