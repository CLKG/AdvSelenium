package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic_JavaScriptExecuter {
	
	WebDriver driver;
	JavascriptExecutor js= (JavascriptExecutor) driver;
		
		public Generic_JavaScriptExecuter(WebDriver driver) {
		super();
		this.driver = driver;
	}

		public void scrolldown(WebElement target)
		{
			int x = target.getLocation().getX();
			int y = target.getLocation().getY();
			
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
			
		}
		
		
		public void scrollup(WebElement target)
		{
			int x = target.getLocation().getX();
			int y = target.getLocation().getY();
			
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+-x+","+-y+")");
			
		}
		
		public void findElementID(String Id,String text)
		{
			js.executeScript("document.getElementById(Id).value=text");
			
		}


}
