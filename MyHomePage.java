package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass{
	

	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	
	public MyLeadsPage clickLeadsLink() {
		String leads = prop1.getProperty("MyHome_Leads_LinkText");
		driver.findElement(By.linkText(leads)).click();
		return new MyLeadsPage(driver);
	}

}
