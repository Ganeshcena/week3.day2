package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraMens {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			//1) Open https://www.myntra.com/
			driver.get("https://www.myntra.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			//2) Mouse hover on MeN 
			Actions builder = new Actions(driver);
			WebElement mens = driver.findElement(By.xpath("//a[text()='Men']"));
			builder.moveToElement(mens).perform();
			//3) Click Jackets
			driver.findElement(By.xpath("(//a[text()='Jackets'])[1]")).click();
			//4) Find the total count of item
			 String text = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		     System.out.println(text);
		     //5) Validate the sum of categories count matches
		     String text2 = driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[1]")).getText();
		     System.out.println(text2);
		     if (text.equals(text2)) {
				System.out.println("The Value Is Different");
			//6)check jackets
	 //List<WebElement> checkJackets = driver.findElements(By.xpath("(//div[@class='common-checkboxIndicator'])[1]"));
	  //for (WebElement jackets : checkJackets) {
				//jackets.click();
			//}
			//7) Click + More option under BRAND
	  driver.findElement(By.xpath("//div[@class='brand-more']")).click();
	        //8) Type Duke and click checkbox
	  
			
			
				
			}
			}
		         
					
				 
					
				
				
				
		     }

	


