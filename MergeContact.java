package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.xpath("//a [text()='Contacts']")).click();
        driver.findElement(By.xpath("//a [text()='Merge Contacts']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
        Thread.sleep(2000);
        Set<String> windowHandles = driver.getWindowHandles();
		java.util.List<String>Handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(Handles.get(1));
		driver.findElement(By.className("linktext")).click();
		driver.switchTo().window(Handles.get(0));
		driver.close();
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif']) [2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		java.util.List<String>Handles1 = new ArrayList<String>(windowHandles);
		driver.switchTo().window(Handles1.get(0));
		Thread.sleep(2000);
		driver.findElement(By.className("linktext")).click();
		driver.switchTo().window(Handles1.get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
        
        		
        
	}

}
