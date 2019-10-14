package manishalearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.sql.Time;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	WebDriver driver;
	
	public WebDriver Initializebrowser() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fi= new FileInputStream("C:/Users/Viswa/MavenE2EProject/src/main/java/global.properties");
		prop.load(fi);
		String browserName=prop.getProperty("browser");
		
		System.out.println(browserName);
		
		//prop.getProperty("URL");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Viswa\\eclipse-workspace\\chromedriver.exe");
			 driver=new ChromeDriver();
			 System.out.println("ji");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//prop.getProperty("URL");
		
		
		return driver;
		
	}

}
