package pageObjects.loginWordPressPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public interface ILoginPage 
{
	By username = By.id("usernameOrEmail");
	By continueLoginBtn = By.cssSelector(".button.form-button.is-primary");
	By password = By.id("password");
	By mySite = By.cssSelector("a[href*='/stats/day/ashwinikoli.wordpress.com']");
	By writeLink = By.xpath("//text()[.='Write']/ancestor::a[1]");
	By searchBox = By.id("search-component-1");
	
	public void EnterUserName(WebDriver driver, String username);
	public void ClickcontinueLoginBtn(WebDriver driver);
	public void EnterPassword(WebDriver driver, String password);
	public boolean ValidateMySite(WebDriver driver);
	public boolean ValidateWriteLink(WebDriver driver);
	public boolean ValidateSearchBox(WebDriver driver);
}
