package pom;

import generic.Base_Page;
import generic.Generic_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstResult_Page extends Base_Page{
	

	
	public FirstResult_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//button[contains(@class,'2MWPVK')]")
	private WebElement addToAdd;
	@FindBy(xpath="//div[@class='_1HmYoV _35HD7C col-5-12 _3KsTU0']/div[1]/div/div[2]")
	private WebElement wishList;
	
	@FindBy(xpath="(//div[@class='_2aUbKa'])[1]")
	private WebElement myAccount;
	
	@FindBy(xpath="(//a[contains(@class,'_2k68Dy')])[5]")
	private WebElement wishList1;
	
	@FindBy(xpath="(//div[@class='TLVGit'])[1]")
	private WebElement selectItem;
	
	
	
	
	public void addToCart1()
	{
		addToAdd.click();
	}
	
	public void addToWishlist()
	{
		wishList.click();
	}
	
	public void myAccount()
	{
		Generic_Actions ga=new Generic_Actions(driver);
		ga.mouseoveraction(myAccount);
		
	}
	
	public void myWishList()
	{
		wishList1.click();
	}
	
	public void selectItem()
	{
		selectItem.click();
	}
	
	

}
