package testcases.LoginWordPress;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.loginWordPressPage.LoginPage;
import startups.DriverFactory;
import utls.ConfigReader;

public class LoginWordPressTC 
{	
	@Test
	public void UserLoginToWordPress()
	{
		WebDriver driver = DriverFactory.intialiseChromeDriver();
		
		LoginPage loginPage = new LoginPage();
		ConfigReader confReader = new ConfigReader();
		
		driver.get(confReader.getURL());
		//driver.get(confReader.getURL().replace("\"",""));
		//driver.get("https://wordpress.com/log-in");
		
		loginPage.EnterUserName(driver, confReader.getUsername());
		loginPage.ClickcontinueLoginBtn(driver);
		loginPage.EnterPassword(driver, confReader.getPassword());
		loginPage.ClickcontinueLoginBtn(driver);
		
		//assertTrue(loginPage.ValidateMySite(driver));
		/*System.out.println(loginPage.ValidateWorkLink(driver));
		assertTrue(loginPage.ValidateWorkLink(driver));
		*/
		System.out.println(loginPage.ValidateSearchBox(driver));
		assertTrue(loginPage.ValidateSearchBox(driver));
		
		driver.close();
	}
}
