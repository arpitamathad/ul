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

//	@Test
//	public void TestHomePage() throws Exception {
//		HomePage homePage = new HomePage(driver);
//		homePage.closePOP();
//		homePage.getNames();
//		Reporter.log("success",true);
//	}
	// Scenario 1 ---->  SignUp
//	@Test
//	public void TestSignUp() throws Exception {
//		HomePage homePage = new HomePage(driver);
//		homePage.closePOP();
//		Thread.sleep(1000);
//		homePage.hoverOnUser();
//		Thread.sleep(1000);
//		homePage.clickOnSignup();
//		String un = "shomathad@gmail.com";
//		homePage.setUserName(un);
//		String pw = "arpita1234";
//		Thread.sleep(1000);
//		homePage.setPassword(pw);
//		homePage.clickSignup();
//	}
	
	// Scenario 2 ----> Login and logout
//	@Test
//	public void TestLoginIn() throws Exception {
//		HomePage homePage = new HomePage(driver);
//		homePage.closePOP();
//		Thread.sleep(1000);
//		homePage.hoverOnUser();
//		homePage.clickOnLogin();
//		Thread.sleep(1000);
//		homePage.setLoginUsername("shomathad@gmail.com");
//		homePage.setLoginPassword("arpita1234");
//		homePage.clickLogin();
//		UserPage userPage = new UserPage(driver);
//		userPage.mouseHover();
//		userPage.logout();
//	}
	
	// Scenario 3 ----> add to cart til checkout
//	@Test
//	public void TestAddToCart() throws Exception{
//		HomePage homePage = new HomePage(driver);
//		homePage.closePOP();
//		Thread.sleep(1000);
//		homePage.hoverOnUser();
//		homePage.clickOnLogin();
//		Thread.sleep(1000);
//		homePage.setLoginUsername("shomathad@gmail.com");
//		homePage.setLoginPassword("arpita1234");
//		homePage.clickLogin(); 
//		
//		UserPage userPage = new UserPage(driver);
//		userPage.selectLivingModule();
//		Thread.sleep(500);
//		userPage.clickOnSwingChairs();
//		
//		SwingsPage swingsPage = new SwingsPage(driver);
//		Thread.sleep(1000);
//		swingsPage.hoverImage();
//		swingsPage.clickOnImage();
//		Thread.sleep(1000);
//		
//		SwingProductPage product = new SwingProductPage(driver);
//		product.clickOnAddToCart();
//		
//		SwingCheckoutPage swingcheckout = new SwingCheckoutPage(driver);
//		swingcheckout.clickOnCheckout();
//	}
	
	// Scenario 4 ----> add to wish list
//	@Test
//	public void TestAddToWishlist() throws Exception {
//	
//		HomePage homePage = new HomePage(driver);
//		homePage.closePOP();
//		Thread.sleep(1000);
//		homePage.hoverOnUser();
//		homePage.clickOnLogin();
//		Thread.sleep(1000);
//		homePage.setLoginUsername("shomathad@gmail.com");
//		homePage.setLoginPassword("arpita1234");
//		homePage.clickLogin(); 
//		
//		UserPage userPage = new UserPage(driver);
//		userPage.selectLivingModule();
//		Thread.sleep(500);
//		userPage.clickOnSwingChairs();
//		
//		SwingsPage swingsPage = new SwingsPage(driver);
//		Thread.sleep(1000);
//		swingsPage.hoverImage();
//		Thread.sleep(500);
//		swingsPage.addToWishList();
//		
//	}
	 // Scenario 5 ----> compare two products 
	@Test
	public void TestCompare() throws Exception {
		HomePage homePage = new HomePage(driver);
		homePage.closePOP();
		Thread.sleep(1000);
		homePage.hoverOnUser();
		homePage.clickOnLogin();
		Thread.sleep(1000);
		homePage.setLoginUsername("shomathad@gmail.com");
		homePage.setLoginPassword("arpita1234");
		homePage.clickLogin(); 
		UserPage userPage = new UserPage(driver);
		userPage.selectLivingModule();
		Thread.sleep(500);
		userPage.clickOnSwingChairs();
		
		SwingsPage swingsPage = new SwingsPage(driver);
		Thread.sleep(1000);
		swingsPage.hoverImage();
		Thread.sleep(1000);
		swingsPage.clickOnAddtoCompare();
		
		Thread.sleep(1000);
		swingsPage.hoverImage1();
		Thread.sleep(2000);
		swingsPage.clickOnAddtoCompare1();
		Thread.sleep(500);
		
		swingsPage.clickOnCompare();
	}
}
