package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;
import generic.Generic_Actions;

public class Home_Page extends Base_Page {
	

	public Home_Page(WebDriver driver) {
		super(driver);
		
	}

	Generic_Actions ga;
	
	@FindBy(xpath="//span[.='Sports, Books & More']")
	private WebElement sportsandBooks;
	
	@FindBy(xpath="//a[.='Literature & Fiction']")
	private WebElement literatureandFiction;
	
		
	@FindBy(xpath = "(//div[contains(@class,'_2aUbKa')])[1]")
	private WebElement myaccount;
	
	@FindBy(xpath = "//a[contains(.,'Logout')]")
	private WebElement logout;
	
	@FindBy(xpath="//span[@class='_1QZ6fC _3Lgyp8']")
	private List<WebElement> Suggestion;
	
	
	
	public void sportsandBooksSearch(WebDriver driver)
	{
		ga=new Generic_Actions(driver);
		ga.mouseoveraction(sportsandBooks);
	}
	
	public void literatureAndFiction(WebDriver driver)
	{
		literatureandFiction.click();
	}
	
	
	public void myaccount(WebDriver driver)
	{
		ga = new Generic_Actions(driver);
		ga.mouseoveraction(myaccount);
	}
	
	public void signOut()
	{
		logout.click();
	}


}
