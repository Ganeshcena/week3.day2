package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leafground.com/pages/Dropdown.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			WebElement click1 = driver.findElement(By.xpath("//option[text()='Selenium']"));
			
			WebElement click2 = driver.findElement(By.xpath("//option[text()='Loadrunner']"));
			
	           

}
}