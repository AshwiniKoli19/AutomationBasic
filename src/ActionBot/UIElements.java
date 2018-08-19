package ActionBot;

import org.openqa.selenium.By;

public class UIElements 
{
	String key = null;
	String location = null;
	String by = null;
	
	public String getKey() 
	{
		return key;
	}
	public void setKey(String key) 
	{
		this.key = key;
	}
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}
	public String getBy() 
	{
		return by;
	}
	public void setBy(String by) 
	{
		this.by = by;
	}
	@Override
	public String toString() {
		return "UIElements [key=" + key + ", location=" + location + ", by=" + by + "]";
	}
	
}
