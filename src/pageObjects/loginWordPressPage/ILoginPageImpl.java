package pageObjects.loginWordPressPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ActionBot.Actions;

public class ILoginPageImpl implements ILoginPage
{

	@Override
	public void EnterUserName(WebDriver driver, String username) 
	{
		// TODO Auto-generated method stub
		Actions.sendkeys(driver.findElement(ILoginPageImpl.username), username);
	}

	@Override
	public void ClickcontinueLoginBtn(WebDriver driver) 
	{
		// TODO Auto-generated method stub
		Actions.click(driver.findElement(ILoginPageImpl.continueLoginBtn));	
		
	}

	@Override
	public void EnterPassword(WebDriver driver, String password) 
	{
		// TODO Auto-generated method stub
		Actions.sendkeys(driver.findElement(ILoginPageImpl.password), password);
	}

	@Override
	public boolean ValidateMySite(WebDriver driver) 
	{
		// TODO Auto-generated method stub
		return Actions.isPresent(driver.findElement(ILoginPageImpl.mySite));
	}

	@Override
	public boolean ValidateWriteLink(WebDriver driver) 
	{
		// TODO Auto-generated method stub
		return Actions.isPresent(driver.findElement(ILoginPageImpl.writeLink));
		
	}

	@Override
	public boolean ValidateSearchBox(WebDriver driver) 
	{
		// TODO Auto-generated method stub
		return Actions.isPresent(driver.findElement(ILoginPageImpl.searchBox));
	}
	
}
