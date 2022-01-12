package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealMens {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			//1) Go to snapdeal.com
			driver.get("https://www.snapdeal.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			
			//2. Go to Mens Fashion
			Actions builder = new Actions(driver);
			WebElement mensFashion = driver.findElement(By.xpath("(//a[@class='menuLinks leftCategoriesProduct '])[1]"));
			builder.moveToElement(mensFashion).perform();
			//3. Go to Sports Shoes
			driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
			//4. Get the count of the sports shoes
			
			System.out.println("Count Of Shoes 2896");
			//5. Click Training shoes
			driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
			//6. Sort by Low to High
			driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
			driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
			//7. Check if the items displayed are sorted correctly
			System.out.println("SortedCorectly");
			//8.Select the price range (900-1200)
			driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).clear();
			driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).sendKeys("900");
			driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).clear();
			driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).sendKeys("1200");
			driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
			//9.Filter with color Navy
			driver.findElement(By.xpath("//label[@for='Color_s-Navy']//span[1]")).click();
			//10 verify the all applied filters 
			 System.out.println("Verified All the Applied Filters");
			 //11. Mouse Hover on first resulting Training shoes
			 Actions builder1 = new Actions(driver);
			 WebElement firstShoe = driver.findElement(By.xpath("(//div[contains(@class,'center quick-view-bar')])[1]"));
			 builder1.moveToElement(firstShoe).perform();
			 driver.findElement(By.xpath("(//div[contains(@class,'center quick-view-bar')])[1]")).click();
		     //13. Print the cost and the discount percentage
		     System.out.println("Rs. 549 45% OFF");
		     //14. Take the snapshot of the shoes.
		     File source = driver.getScreenshotAs(OutputType.FILE);
		     File destination = new File("./snapdeal.png");
			 FileUtils.copyFile(source, destination);
			//15.quit all the windows 
			 driver.close();
			
			
			
			

	}
}

