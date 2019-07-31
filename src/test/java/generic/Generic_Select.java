package generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_Select {
	

	Select s = null;
	
	
		
	public Generic_Select(WebElement target) {
				
			s=new Select(target);
			
	}

	public boolean ifMultiple()
	{
		
		return s.isMultiple();
	}
	
	public void selectByIndex(int index)
	{
		
		s.deselectByIndex(index);
		
	}
	
	public void selectByvalue(String value) throws InterruptedException
	{
				
		s.selectByValue(value);
	}
	
	public void selectByText(String text)
	{
		s.selectByVisibleText(text);		
	}
	
	public void delectAll()
	{
		s.deselectAll();
	}
	
	public void deSelectByIndex(int index)
	{
		s.deselectByIndex(index);
	}
	
	public void deSelectByvalue(String value)
	
	{
		s.deselectByValue(value);
	}
	
	public void deSelectByText(String text)
	{		
		s.deselectByVisibleText(text);
	}
	
	public List<WebElement> getOptions()
	{
		return s.getOptions();
		
	}
	public List<WebElement> allSelectedOptions(String text)
	{
		return s.getAllSelectedOptions();
	}
	
	public WebElement firstSelectedOptions(String text)
	{
		return s.getFirstSelectedOption();
	}


}
