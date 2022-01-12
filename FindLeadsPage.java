package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FindLeadsPage extends BaseClass{
	

	public FindLeadsPage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	
	
	public ViewLeadPage clickFirstMatchingLead() {
		driver.findElement(By.xpath("//*")).click();
		return new ViewLeadPage(driver);
	}
}
