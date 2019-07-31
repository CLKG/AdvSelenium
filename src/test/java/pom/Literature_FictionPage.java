package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Literature_FictionPage extends Base_Page{
	

	public Literature_FictionPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//div[@class='_1p7h2j _2irnD_']")
	private WebElement radio1;
	
	@FindBy(xpath="(//div[@class='_1p7h2j'])[1]")
	private WebElement radio2;
	
	@FindBy(xpath="(//div[@class='_1p7h2j'])[8]")
	private WebElement radio3;
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	private WebElement searchTBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath="//div[.='Price -- Low to High']")
	private WebElement Sortbutton;
	
	@FindBy(xpath="(//div[@class='_3O0U0u']/div[1])[2]/div/a[1]")
	private WebElement result;
	@FindBy(xpath="(//div[@class='_3O0U0u']/div[1])[1]/div/a[1]/div[3]")
	private WebElement wishlist;
		public void radioButton1()
	{
		radio1.click();
	}
	
	public void radioButton2()
	{
		radio2.click();
	}
	public void radioButton3()
	{
		radio3.click();
	}
	
	public void searchTBox(String bookName)
	{
		searchTBox.sendKeys(bookName);
	}
	
	public void searchButton()
	{
		searchButton.click();
	}
	public void sortBy()
	{
		Sortbutton.click();
	}
	public void resultSelection()
	{
		result.click();
	}
	public void addWishList()
	{
		wishlist.click();
	}


}
