package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
	    driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
	    org.openqa.selenium.Alert alert = driver.switchTo().alert();
	    alert.sendKeys("GaneshKumar");
	    alert.accept();
	    String text = driver.findElement(By.id("demo")).getText();
	    System.out.println(text);
	    boolean bn = driver.getPageSource().contains(text);
	    System.out.println(bn);
	    
		
		

	}

}
