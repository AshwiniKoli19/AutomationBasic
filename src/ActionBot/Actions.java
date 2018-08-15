package ActionBot;

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
}
