package week4.day1;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc {
	

	public static void main(String[] args) throws InterruptedException {
		    WebDriverManager.chromedriver().setup();
		    ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            ChromeDriver driver = new ChromeDriver(options);
		    driver.manage().window().maximize();
			driver.get("https://www.irctc.co.in/nget/train-search");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
			String title2 = driver.getTitle();
			System.out.println(title2);
			driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
			String title = driver.getTitle();
			System.out.println(title);
			Set<String> windowHandles = driver.getWindowHandles();
			java.util.List<String>Handles = new ArrayList<String>(windowHandles);
			driver.switchTo().window(Handles.get(0));
			driver.close();
			
			
			
			 
			 
			
		    
	}
	}


