package utls;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader 
{
	Properties prop = new Properties();
	InputStream input = null;
	
	public Properties createInputStream()
	{
	/*	Properties prop = new Properties();
		InputStream input = null;
	*/	
		try
		{
			input = new FileInputStream("D:\\oxygen-workplace\\AutomationBasic\\src\\inputs\\config.properties");
			
			prop.load(input);
			/*
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
			System.out.println(prop.getProperty("browser"));*/
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
		//	System.out.println("finally");
		}
		return prop;
	}
	
	public String getURL()
	{
		 prop =createInputStream();
		
		String url = prop.getProperty("url");
		return url;
	}
	
	public String getUsername()
	{
		prop =createInputStream();
		
		String username = prop.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		
		prop =createInputStream();
		
		String password = prop.getProperty("password");
		return password;
	}
	
	public String getBrowser()
	{
		
		prop =createInputStream();
		
		String browser = prop.getProperty("browser");
		return browser;
	}
}
