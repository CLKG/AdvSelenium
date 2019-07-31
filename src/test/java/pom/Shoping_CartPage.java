package pom;

import net.sourceforge.htmlunit.corejs.javascript.regexp.SubString;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Shoping_CartPage extends Base_Page{
	
	public Shoping_CartPage(WebDriver driver) {
		
		super(driver);
		
	}
	@FindBy(xpath="//span[contains(.,'Place Order')]")
	private WebElement placeOrder;
	@FindBy(xpath="//div[contains(@class,'_1lBhq8')]")
	private WebElement cart;
	
	@FindBy(xpath="//div[.='Remove']")
	private WebElement remove;
	
	@FindBy(xpath="//div[contains(@class,'gdUKd9 _3Z4XMp _2nQDKB')]")
	private WebElement removeItem;
	
	//div[contains(@class,'gdUKd9 _3Z4XMp _2nQDKB')]
	
	@FindBy(xpath="//div[contains(@class,'1lBhq8')]")
	private WebElement myCart;
	
	@FindBy(xpath="//div[@class='hJKWmk']")
	private WebElement emptyCart;
	
	public void placeOrder()
	{
		placeOrder.click();
	}
	public void cartNo()
	{
		System.out.println(cart.getText());
	}
	public void removeitem()
	{
		remove.click();
	}
	
	public void removepopup()
	{
		removeItem.click();
	}
	
	public int cartitemcount()
	{
		String text=myCart.getText();
		String count = text.substring(9, 10);
		 int c = Integer.parseInt(count);
		 return c;
	}
	public void emptyCart()
	{
		System.out.println(emptyCart.getText());
	}
}
