package basic;

import utls.ConfigReader;

public class testConfig {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ConfigReader config = new ConfigReader();
		
		System.out.println(config.getBrowser());
		System.out.println(config.getPassword());
		System.out.println(config.getURL());
		System.out.println(config.getUsername());
	}

}
