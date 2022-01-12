package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.leafground.com/pages/Alert.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			Thread.sleep(2000);
			alert.accept();
			driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
			Alert alert1 = driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println(alertText);
			Thread.sleep(2000);
			alert.dismiss();
			driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
			Alert alert2 = driver.switchTo().alert();
			Thread.sleep(2000);
			alert.sendKeys("GaneshKumar");
			Thread.sleep(2000);
			alert.accept();
			driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
			Thread.sleep(2000);
			Alert alert3 = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
			driver.close();
			
			
			
			
			
			

	}

}
