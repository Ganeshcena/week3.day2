package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			Actions builder = new Actions(driver);
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement target = driver.findElement(By.id("droppable"));
			Thread.sleep(2000);
			builder.dragAndDrop(source, target).perform();
			driver.close();
			
			
	}

}
