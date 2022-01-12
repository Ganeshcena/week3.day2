package props;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperties {
	
	/*
	 * Data for testcase --> Excel / Json
	 * Data for entire suite --> testng xml / properties
	 * 
	 */
	
	@Test
	public void read() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(new File("src/main/resources/fr.properties"));
		prop.load(fis);
		
		// Read by the key
		String property = prop.getProperty("MyHome_Leads_LinkText");
		System.out.println(property);
		
	}

}
