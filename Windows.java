package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.leafground.com/pages/Window.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
           driver.findElement(By.xpath("//button[@id='home']")).click();
           Set<String> windowHandles = driver.getWindowHandles();
   		java.util.List<String>Handles = new ArrayList<String>(windowHandles);
   		driver.switchTo().window(Handles.get(1));
   		System.out.println(Handles.get(0));
   		System.out.println(Handles.get(1));
   		Thread.sleep(2000);
   		driver.close();
        Set<String> windowHandles1 = driver.getWindowHandles();
   		java.util.List<String>Handles1 = new ArrayList<String>(windowHandles1);
   		driver.switchTo().window(Handles.get(0));
   		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
   		Set<String> windowHandles2 = driver.getWindowHandles();
   		java.util.List<String>Handles2 = new ArrayList<String>(windowHandles2);
   		driver.switchTo().window(Handles2.get(2));
   		Thread.sleep(2000);
   		driver.close();
   	    Set<String> windowHandles3 = driver.getWindowHandles();
   		java.util.List<String>Handles3 = new ArrayList<String>(windowHandles3);
   		driver.switchTo().window(Handles3.get(1));
   		Thread.sleep(2000);
   		driver.close();
   	    
   		Set<String> windowHandles4= driver.getWindowHandles();
   		List<String>Handles4 = new ArrayList<String>(windowHandles4);
   		driver.switchTo().window(Handles.get(0));
   		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
   		Thread.sleep(2000);
   		Set<String> windowHandles5= driver.getWindowHandles();
   		List<String>Handles5 = new ArrayList<String>(windowHandles5);
   		driver.switchTo().window(Handles5.get(2));
   		Thread.sleep(2000);
   		driver.close();
   		Set<String> windowHandles6= driver.getWindowHandles();
   		List<String>Handles6= new ArrayList<String>(windowHandles6);
   		driver.switchTo().window(Handles6.get(1));
   		Thread.sleep(2000);
   		driver.close();
   		Set<String> windowHandles7= driver.getWindowHandles();
   		List<String>Handles7 = new ArrayList<String>(windowHandles7);
   		driver.switchTo().window(Handles.get(0));
        driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']")).click();
        Thread.sleep(5000);
        Set<String> windowHandles8= driver.getWindowHandles();
   		List<String>Handles8 = new ArrayList<String>(windowHandles8);
   		driver.switchTo().window(Handles8.get(2));
   		Thread.sleep(2000);
   		driver.close();
   		Set<String> windowHandles9= driver.getWindowHandles();
   		List<String>Handles9 = new ArrayList<String>(windowHandles9);
   		driver.switchTo().window(Handles9.get(1));
   		Thread.sleep(2000);
   		driver.close();
   		driver.quit();
   		
        
   		
   		
   		
   		
   		
   		
   		
   		
   		
   		
           
	}

}
