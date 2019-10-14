package manishalearning;

import java.io.IOException;

import manishalearning.base;
import org.testng.annotations.Test;


public class DemoTest extends base {
	
	@Test
	public void Homepage() throws IOException
	{
		driver =Initializebrowser();
		driver.get("http://www.google.com");
	}
	


}


