package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//1) Go to https://www.nykaa.com/
			driver.get("https://www.nykaa.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
			Actions builder = new Actions(driver);
		   //2) Mouseover on Brands and Search L'Oreal Paris
			WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
			builder.moveToElement(brand).perform();
			//3) Click L'Oreal Paris
			driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
			driver.findElement(By.xpath("//div[@class='css-ov2o3v']//a[1]")).click();
			//4) Check the title contains L'Oreal Paris(Hint-GetTitle)
			String text = driver.findElement(By.xpath("//div[@class='css-ov2o3v']//a[1]")).getText();
			System.out.println(text);
			//5) Click sort By and select customer top rated
			driver.findElement(By.className("sort-name")).click();
			driver.findElement(By.xpath("//div[@id='filter-sort']/div[1]/div[1]/ul[1]/div[4]/label[1]/div[1]/span[1]")).click();
			//6) Click Category and click Hair->Click haircare->Shampoo
			driver.findElement(By.xpath("//span[text()='Category']")).click();
	        driver.findElement(By.xpath("//span[text()='Hair']")).click();
	        driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
	        driver.findElement(By.xpath("//span[@class='title']")).click();			
	        //7) Click->Concern->Color Protection
			driver.findElement(By.xpath("//span[text()='Concern']")).click();
			driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
			//8)check whether the Filter is applied with Shampoo
			String text2 = driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
			if(text2.contains("color Proctection")) {
				System.out.println("filter is applied correctly");
			}
			//9) Click on L'Oreal Paris Colour Protect Shampoo
			driver.findElement(By.xpath("(//img[@class='css-11gn9r6'])[2]")).click();
			Thread.sleep(2000);
			//10) GO to the new window and select size as 175ml
			Set<String> windowHandles = driver.getWindowHandles();
	   		java.util.List<String>Handles = new ArrayList<String>(windowHandles);
	   		driver.switchTo().window(Handles.get(0));
	   		driver.findElement(By.xpath("(//img[@class='css-11gn9r6'])[1]")).click();
	       	//11) Print the MRP of the product
	   		WebElement mrpOfTheProduct = driver.findElement(By.xpath("//span[@class='css-12x6n3h']"));
	   		System.out.println(mrpOfTheProduct);
	   		
	   		//12) Click on ADD to BAG
	   		driver.findElement(By.xpath("(//span[@class='btn-text'])[1]")).click();
	   		//13) Go to Shopping Bag
	   		driver.findElement(By.xpath("(//span[@class='cart-count'])[1]")).click();
	   		//14) Print the Grand Total amount
              WebElement grandTotal = driver.findElement(By.xpath("(//span[text()='Grand Total'])[2]"));
	   		 System.out.println(grandTotal);
	   		//15) Click Proceed
	   		 driver.findElement(By.xpath("//span[text()='PROCEED']")).click();
	   		 //16) Click on Continue as Guest
	   		 driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
	   		 //17) Check if this grand total is the same in step 14
	   		 WebElement finalTotal = driver.findElement(By.xpath("//div[text()='Grand Total']"));
	   		 System.out.println(finalTotal);
	   		 if (grandTotal.equals(finalTotal)) {
				System.out.println("Grand total is Same");
				//18)Quit all windows
				driver.quit();
				
			}
	   		
			
			

	}

}
