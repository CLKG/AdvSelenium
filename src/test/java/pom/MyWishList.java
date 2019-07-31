package pom;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class MyWishList extends Base_Page {

	public MyWishList(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="(//div[@class='NqIFxw'])[5]/span")
	private WebElement giftCard;
	
	@FindBy(xpath="(//div[@class='_20yN1P _3FfcKU _3piyP1'])[1]")
	private WebElement delete;
	
	public String giftCardamount()
	{
		String amount = giftCard.getText();
		return amount ;
	
	}
	
	public void delete()
	{
		delete.click();
	}

	
	
	
	
	

}
