package pageObjects.loginWordPressPage;

import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	public void EnterUserName(WebDriver driver, String username) 
	{
		// TODO Auto-generated method stub
		ILoginPageImpl iLoginPage = new ILoginPageImpl();
		iLoginPage.EnterUserName(driver, username);
	}

	
	public void ClickcontinueLoginBtn(WebDriver driver) 
	{
		// TODO Auto-generated method stub
		ILoginPageImpl iLoginPage = new ILoginPageImpl();
		iLoginPage.ClickcontinueLoginBtn(driver);
	}

	
	public void EnterPassword(WebDriver driver, String password) 
	{
		// TODO Auto-generated method stub
		ILoginPageImpl iLoginPage = new ILoginPageImpl();
		iLoginPage.EnterPassword(driver, password);
	}
	
	public boolean ValidateMySite(WebDriver driver)
	{
		// TODO Auto-generated method stub
		ILoginPageImpl iLoginPage = new ILoginPageImpl();
		return iLoginPage.ValidateMySite(driver);
	}
	
	public boolean ValidateWorkLink(WebDriver driver)
	{
		// TODO Auto-generated method stub
		ILoginPageImpl iLoginPage = new ILoginPageImpl();
		return iLoginPage.ValidateWriteLink(driver);
	}
	
	public boolean ValidateSearchBox(WebDriver driver)
	{
		// TODO Auto-generated method stub
		ILoginPageImpl iLoginPage = new ILoginPageImpl();
		return iLoginPage.ValidateSearchBox(driver);
	}
}
