package ActionBot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class Actions 
{
	public static void click(WebElement element)
	{
		element.click();
	}
	
	public static void sendkeys(WebElement element, String str)
	{
		element.sendKeys(str);
	}
	
	public static void get(WebDriver driver, String url)
	{
		driver.get(url);
	}
	
	public static boolean isPresent(WebElement element)
	{
		return element.isDisplayed();
	}
	
	public static void takeScreenSot(WebDriver driver) throws IOException
	{
		Random ran = new Random();
		String screenShotsPath = "D:\\oxygen-workplace\\AutomationBasic\\src\\screenShots\\screenshot_"+ran.nextInt()+".png";
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		
		File scrShotFile = scrShot.getScreenshotAs(OutputType.FILE);
		File screenShots = new File(screenShotsPath);
		
		FileUtils.copyFile(scrShotFile, screenShots);
	}
}
