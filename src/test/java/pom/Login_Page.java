package pom;

import generic.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Base_Page {
	
	
	

public Login_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//	@FindBy(xpath="//button[.='✕']")
//	private WebElement button;
//	@FindBy(xpath="//div[.='Login & Signup']")
//	private WebElement loginAndSignup;
//	@FindBy(xpath="//button[.='LOGIN']")
//	private WebElement loginbutton;
//	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(.,'Login')]")
	private WebElement login;
	@FindBy(xpath="//span[.='Your username or password is incorrect']")
	private WebElement error_Message;
	
	
//	public void cancelButton()
//	{
//		button.click();
//	}
//	
//	public void LoginAndSign()//WebDriver driver)
//	{
//		
//		//GenericActions ga = new GenericActions(driver);
//		//ga.mouseoveraction(loginAndSignup);
//		
//		loginAndSignup.click();
//		
//	}
//	
	
	
	public void emailid(String emailId)
	{
		email.sendKeys(emailId);
	}
	
	public void pswd(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void loginButton()
	{
		login.click();
	}


}
