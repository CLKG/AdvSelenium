package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Generic_BrowserActions {
		
	public void minimize() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
		
	}
		
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void dragAndDrop(WebDriver driver,int x,int y)
	{
		Point p = new Point(x, y);
		driver.manage().window().setPosition(p);
		
	}
	
	public void windowResize(WebDriver driver,int x,int y) {
		
		Dimension d = new Dimension(x,y);
		driver.manage().window().setSize(d);
	}
	
	public void close() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_C);	
	}
	
	public void backWindow(WebDriver driver)
	{
		driver.navigate().back();
	}
	
	public void forwardWindow(WebDriver driver)
	{
		driver.navigate().forward();
	}
	public void windowrefresh(WebDriver driver)
	{
		driver.navigate().refresh();
	}


}
