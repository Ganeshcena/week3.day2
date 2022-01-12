package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass{
	

	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	
	public CreateLeadPage clickCreateLeadLink() {
		String cl = prop1.getProperty("MyLeads_CreateLead_LinkText");
		driver.findElement(By.linkText(cl)).click();
		return new CreateLeadPage(driver);
	}

	public FindLeadsPage clickFindLeadsLink() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}
}
