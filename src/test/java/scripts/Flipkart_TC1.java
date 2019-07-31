package scripts;

import org.testng.annotations.Test;

import pom.Home_Page;
import pom.Login_Page;
import generic.Excel_Class;
import generic.Generic_Class;

public class Flipkart_TC1 extends Generic_Class {

	@Test(priority = 0)
	public void login() throws InterruptedException {

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
		hp.myaccount(driver);
		hp.signOut();

		lp.verifyTitle(lt);
		// System.out.println(driver.getTitle());

	}

	@Test(invocationCount = 0)
	public void logout() throws InterruptedException {
		Home_Page hp = new Home_Page(driver);
		String ht = Excel_Class.getcellvalue("Flipkart_TC1", 1, 3);
		hp.verifyTitle(ht);
		hp.myaccount(driver);
		hp.signOut();
		Login_Page lp = new Login_Page(driver);

		Thread.sleep(3000);
		String lt = Excel_Class.getcellvalue("Flipkart_TC1", 1, 2);
		lp.verifyTitle(lt);
	}

}
