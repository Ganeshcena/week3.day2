package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
      
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		
		WebElement men = driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct ']/span[contains(text(),'Men')]"));
		WebElement shirts = driver.findElement(By.xpath("(//span[text()='Shirts'])[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).pause(1000).click(shirts).perform();
		WebElement wishlist = driver.findElement(By.xpath("//span[@class='animated-icon']"));
		builder.moveToElement(wishlist).perform();
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		driver.close();
		
		
		

	}

}
