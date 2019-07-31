package scripts;

import java.util.Set;

import generic.Excel_Class;
import generic.Generic_Class;

import org.testng.annotations.Test;

import pom.FirstResult_Page;
import pom.Home_Page;
import pom.Literature_FictionPage;
import pom.Login_Page;

public class Flipkart_TC2 extends Generic_Class {

	@Test
	public void addToCart() throws InterruptedException

	{
		Login_Page lp = new Login_Page(driver);

		Thread.sleep(3000);
		String lt = Excel_Class.getcellvalue("Flipkart_TC1", 1, 2);
		lp.verifyTitle(lt);

		// System.out.println(driver.getTitle());

		String un = Excel_Class.getcellvalue("Flipkart_TC1", 1, 0);
		lp.emailid(un);
		Thread.sleep(3000);

		String pwd = Excel_Class.getcellvalue("Flipkart_TC1", 1, 1);
		lp.pswd(pwd);

		Thread.sleep(2000);
		lp.loginButton();

		Home_Page hp = new Home_Page(driver);

		String ht = Excel_Class.getcellvalue("Flipkart_TC1", 1, 3);
		hp.verifyTitle(ht);
		Thread.sleep(2000);

		hp.sportsandBooksSearch(driver);

		Thread.sleep(4000);

		hp.literatureAndFiction(driver);

		Literature_FictionPage lp1 = new Literature_FictionPage(driver);

		// lp.verifyTitle(title);

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

		for (String id : ids) {
			driver.switchTo().window(id);
		}

		FirstResult_Page fp = new FirstResult_Page(driver);

		System.out.println(driver.getTitle());

		fp.addToCart1();

	}

}
