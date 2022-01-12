package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	
				//action+ElementName
	public LoginPage enterUsername(String username) throws InterruptedException {
		driver.findElement(By.name("USERNAME")).sendKeys(username);
		//		Thread.sleep(10000);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		return this;
	}
	
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new HomePage(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
		

}
