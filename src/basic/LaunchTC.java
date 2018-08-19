package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import startups.DriverFactory;

public class LaunchTC 
{

	@Test
	public void google()
	{
		
		WebDriver driver = null;
		
		driver = DriverFactory.intialiseChromeDriver();
		/*System.setProperty("webdriver.chrome.driver", "D:\\jars & drivers\\chromedriver_win32\\chromedriver.exe");
		System.out.println("start");
		
		WebDriver driver = new ChromeDriver();		
		*/
		/*------------------------------------------- Launch browser ---------------------------------------------------*/
		
		driver.get("https://www.ecosia.org/");
		
		System.out.println("Driver launched..");
		
/*		---------------------------------------- Web Page - 1 --------------------------------------------------------*/
		
		WebElement searchBox = driver.findElement(By.xpath("//*[@type = 'search' and @name = 'q']")); /*--absolute path */

		WebElement searchButtom = driver.findElement(By.xpath("// *[@type = 'submit']"));
		
		boolean flag = searchBox.isDisplayed();
				
		Assert.assertTrue(flag);
		
		/*--------------------------------------------- Web Page - 2 ---------------------------------------------------*/
		
		String searchText = "ecosia";
		
		searchBox.sendKeys(searchText);
		
		searchButtom.click();
		
		/*------------------------------------------- Web Page - 3 -----------------------------------------------------*/
		
		WebElement counter = driver.findElement(By.xpath("html/body/div[1]/nav/div[2]/div[3]/label/span"));
		
		Assert.assertTrue(counter.isDisplayed());
		
		String countPlant = counter.getText();
		
		System.out.println("You have planted "+ countPlant+ " successfully..");
		
		/*System.out.println(flag);*/
			
		/*
		if (flag != false)
		{
			System.out.println("Google.com launch verified");
			
		}
		else
		{
			System.out.println("Failure while launching google.com");
		}*/
		driver.close();
		System.out.println("Browser closed");
	}
	
	
	
	/*public WebDriver intialiseChromeDriver(WebDriver driver)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\jars & drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		return driver;
	}*/
	
}
