package testcases.LoginWordPress;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ActionBot.Actions;
import pageObjects.loginWordPressPage.LoginPage;
import startups.DriverFactory;
import utls.ConfigReader;

public class LoginWordPressTC 
{	
	@Test
	public void UserLoginToWordPress() throws IOException
	{
		WebDriver driver = DriverFactory.intialiseChromeDriver();
		
		LoginPage loginPage = new LoginPage();
		ConfigReader confReader = new ConfigReader();
		
		driver.get(confReader.getURL());
		//driver.get(confReader.getURL().replace("\"",""));
		//driver.get("https://wordpress.com/log-in");
		
		loginPage.EnterUserName(driver, confReader.getUsername());
		Actions.takeScreenSot(driver);
		loginPage.ClickcontinueLoginBtn(driver);
		loginPage.EnterPassword(driver, confReader.getPassword());
		loginPage.ClickcontinueLoginBtn(driver);
		
		//assertTrue(loginPage.ValidateMySite(driver));
		/*System.out.println(loginPage.ValidateWorkLink(driver));
		assertTrue(loginPage.ValidateWorkLink(driver));
		*/
		System.out.println(loginPage.ValidateSearchBox(driver));
		AssertJUnit.assertTrue(loginPage.ValidateSearchBox(driver));
		
		driver.close();
	}
}
