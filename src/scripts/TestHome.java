package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.HomePage;
import page.SwingCheckoutPage;
import page.SwingProductPage;
import page.SwingsPage;
import page.UserPage;

public class TestHome extends BaseTest{

	@Test
	public void TestHomePage() throws Exception {
		HomePage homePage = new HomePage(driver);
		homePage.closePOP();
		homePage.getNames();
		Reporter.log("success",true);
	}
//	// Scenario 1 ---->  SignUp
//	@Test
//	public void TestSignUp() throws Exception {
//		HomePage homePage = new HomePage(driver);
//		homePage.closePOP();
//		Thread.sleep(1000);
//		homePage.hoverOnUser();
//		Thread.sleep(1000);
//		homePage.clickOnSignup();
//		String un = "arpita65.happiness@gmail.com";
//		homePage.setUserName(un);
//		String pw = "arpita1234";
//		Thread.sleep(1000);
//		homePage.setPassword(pw);
//		homePage.clickSignup();
//	}	
}
