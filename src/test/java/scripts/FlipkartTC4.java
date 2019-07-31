package scripts;

import generic.Excel_Class;
import generic.Generic_Class;
import generic.Generic_Screenshot;

import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;

import pom.FirstResult_Page;
import pom.Home_Page;
import pom.Literature_FictionPage;
import pom.Login_Page;
import pom.MyWishList;

public class FlipkartTC4 extends Generic_Class {
	
	@Test
	public void removeCart() throws InterruptedException, IOException
	{
	try
	{
	Login_Page lp= new Login_Page(driver);

	Thread.sleep(3000);
	String lt = Excel_Class.getcellvalue("Flipkart_TC1",1,2);
	lp.verifyTitle(lt);
	
	//System.out.println(driver.getTitle());

	String un = Excel_Class.getcellvalue("Flipkart_TC1",1,0);
	lp.emailid(un);
	Thread.sleep(3000);
	
	String pwd = Excel_Class.getcellvalue("Flipkart_TC1",1,1);
	lp.pswd(pwd);
	
	Thread.sleep(2000);
	lp.loginButton();
	
	Home_Page hp = new Home_Page(driver);
	
	String ht= Excel_Class.getcellvalue("Flipkart_TC1",1,3);
	hp.verifyTitle(ht);
	Thread.sleep(2000);
	
	hp.sportsandBooksSearch(driver);
	
	Thread.sleep(4000);
	
	hp.literatureAndFiction(driver);
	
			
	Literature_FictionPage lp1 = new Literature_FictionPage(driver);
	
	String lpt = Excel_Class.getcellvalue("Flipkart_TC1", 1, 7);
	
	lp.verifyTitle(lpt);
	
	System.out.println(driver.getTitle());
	
	Thread.sleep(3000);
	lp1.radioButton1();
	Thread.sleep(3000);
	lp1.radioButton2();
	Thread.sleep(3000);
	lp1.radioButton3();
	
	lp1.searchTBox("Digital Fortress");

	lp1.searchButton();
	
	lp1.sortBy();
	
	Thread.sleep(5000);

	lp1.resultSelection();
	
	Thread.sleep(5000);
	
	Set<String> ids = driver.getWindowHandles();
	
	for(String id:ids)
	{
		driver.switchTo().window(id);
	}
	
	FirstResult_Page fp = new FirstResult_Page(driver);
	String fpt=Excel_Class.getcellvalue("Flipkart_TC1", 1, 6);
	System.out.println(fpt);
	fp.verifyTitle(fpt);
	
	Thread.sleep(4000);
		
	//fp.addToCart1();
	
	fp.addToWishlist();
	
	fp.myAccount();
	
	Thread.sleep(3000);
	
	fp.myWishList();
	
	Thread.sleep(2000);
	
	//fp.selectItem();
	
	MyWishList ml=new MyWishList(driver);
	
	String GiftCartAmountbalance = ml.giftCardamount();
	
	System.out.println(GiftCartAmountbalance);
	}
	catch(Exception e)
	{
	//	Generic_Screenshot.getphoto(driver,);
	}
	
	}

}
