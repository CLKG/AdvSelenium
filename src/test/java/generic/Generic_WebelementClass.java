package generic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

public class Generic_WebelementClass {
	
	public String cssValue(WebElement target,String attribute)	
	{
		System.out.println(target.getCssValue(attribute));
		return target.getCssValue(attribute);
	}
	
	public void getAttribute(WebElement target,String attribute)
	{
		System.out.println(target.getAttribute(attribute));
		//return target.getAttribute(attribute);
		
	}
	
	public Point Location(WebElement target)
	{
		System.out.println(target.getLocation());
		return target.getLocation();
		
	}
	
	public Rectangle Rect(WebElement target)
	{
		System.out.println(target.getRect());
		return target.getRect();
	}
	
	public Dimension size(WebElement target)
	{
		System.out.println(target.getSize());
		return target.getSize();
		
	}
	
	public void tag(WebElement target)
	{
		System.out.println(target.getTagName());
	}
	
	public void text(WebElement target)
	{
		System.out.println(target.getText());
	}
	public boolean ifdisplayed(WebElement target)
	{
		return target.isDisplayed();
		
	}
	public boolean ifEnable(WebElement target)
	{
		return target.isEnabled();
	}
	
	public boolean ifselected(WebElement target)
	{
		return target.isEnabled();
	}


}
