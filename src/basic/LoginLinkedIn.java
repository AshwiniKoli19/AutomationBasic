package basic;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import flows.LogInLogOut;
import startups.DriverFactory;

public class LoginLinkedIn
{
	//@Test
	public void loginLinkedIn()
	{
		WebDriver driver =DriverFactory.intialiseChromeDriver();
		
/*		String url = "https://www.linkedin.com";
		String email = "ashwini3422@gmail.com";
		String password = "Ashu@123";
		*/String userName = "Ashwini Koli";
		
		String url = "https://joinindiarmy.nic.in";
		String email = "ningrajrkoli@hotmail.com";
		String password = "KOLIN_28434";
		
		LogInLogOut loginout =new LogInLogOut();
	
		loginout.logInToLinkedIn(driver, url, email, password);
		
		WebElement usrName = driver.findElement(By.xpath(".//*[@class = \"Sans-17px-black-85%-semibold\" ]"));
		
		Assert.assertEquals(usrName.getText(), userName);
		
		driver.close();
	}

	@Test
	public void searchConnection()
	{
		WebDriver driver =DriverFactory.intialiseChromeDriver();
		
		String url = "https://joinindiarmy.nic.in";
		String email = "ningrajrkoli@hotmail.com";
		String password = "KOLIN_28434";
		String userName = "Ashwini Koli";
		String searchUser = "Divyani Bhisikar";
		LogInLogOut loginout =new LogInLogOut();
	
		loginout.logInToLinkedIn(driver, url, email, password);
		
		try {
			driver.wait(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*WebElement searchBox = driver.findElement(By.cssSelector("#ember1012"));
		
		
		System.out.println(searchBox.isDisplayed());
		searchBox.sendKeys(searchUser);
		
		WebElement searchUsr = driver.findElement(By.id("search-conversations"));
		
		searchUsr.sendKeys(searchUser);
		
		WebElement searchBtn = driver.findElement(By.className("msg-search-form__search-icon svg-icon-wrap"));
		
		searchBtn.click();
		
		WebElement msgTextBox = driver.findElement(By.className("msg-form__contenteditable Sans-15px-black-70% flex-grow-1"));
		
		msgTextBox.sendKeys("Automation script..");
		
		WebElement msgSendButton = driver.findElement(By.className("msg-form__send-button button-primary-small"));
		
		msgSendButton.click();
		List<WebElement> searchAutoPopulate= driver.findElements(By.className("search-typeahead-v2__hit-text Sans-15px-black-85%-semibold"));
		
		Iterator<WebElement> itr = searchAutoPopulate.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		*/driver.close();
	}
}
