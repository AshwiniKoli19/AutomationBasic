package flows;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInLogOut 
{
	public void logInToLinkedIn(WebDriver driver, String url, String email, String password)
	{
		driver.get(url);
		
		WebElement homeLogo = driver.findElement(By.className("lazy-loaded"));
		assertTrue(homeLogo.isDisplayed());
		WebElement emailId = driver.findElement(By.id("login-email"));
		WebElement passwrd = driver.findElement(By.id("login-password"));
		WebElement signInButton = driver.findElement(By.id("login-submit"));
		
		emailId.sendKeys(email);
		passwrd.sendKeys(password);
		signInButton.click();
	}
	
}
