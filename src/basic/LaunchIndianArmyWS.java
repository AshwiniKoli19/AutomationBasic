package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchIndianArmyWS {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\jars & drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://joinindianarmy.nic.in";
		String email = "ningrajrkoli@hotmail.com";
		String password = "KOLIN_28434";
		
		
		driver.get(url);
	}

}
