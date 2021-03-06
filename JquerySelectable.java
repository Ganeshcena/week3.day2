package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquerySelectable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/selectable/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			Actions builder = new Actions(driver);
			WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
			WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
			builder.clickAndHold(item1).moveToElement(item6).release().perform();
			Thread.sleep(2000);
			driver.close();
			

		
		
		
		
		
		

	}

}
