package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://dev65225.service-now.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("mXWxT9a3BuiO");
			driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
			driver.findElement(By.id("filter")).sendKeys("incident");
			driver.findElement(By.xpath("//div[text()='Incidents']")).click();
	        driver.findElement(By.xpath("//a[@class='breadcrumb_link']/b[1]")).click();
			
			
			
		
			
			
			
			

	}

}
