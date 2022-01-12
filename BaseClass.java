package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import utils.ReadExcel;

public class BaseClass {

	public ChromeDriver driver; // driver = null
	public static Properties prop1;
	public String fileName;

	@DataProvider
	public String[][] sendData() throws IOException {

		return ReadExcel.readData(fileName);

	}

	@Parameters({"url"})
	@BeforeMethod
	public void preCondition(String url) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // driver is initialized "sdadq442342dfdff"
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(new File("src/main/resources/app.properties"));
		prop.load(fis);
		
		String lang = prop.getProperty("language");
		prop1 = new Properties();
		FileInputStream fis1 = new FileInputStream(new File("src/main/resources/"+lang+".properties"));
		prop1.load(fis1);
		
		new LoginPage(driver)
		.enterUsername(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsLink();
		
		

	}

	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
