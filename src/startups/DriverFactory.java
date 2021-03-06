package startups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory 
{
	public static WebDriver intialiseChromeDriver()
	{
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\jars & drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
}
