package testBrowser;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserTest 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver1.exe");
	}
	@Test
	public void testbrowser()
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}

}
