package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import page.HomePage;
import page.SwingCheckoutPage;
import page.SwingProductPage;
import page.SwingsPage;
import page.UserPage;

public class TestAddToCart extends BaseTest {

	// Scenario 3 ----> add to cart til checkout
		@Test
		public void TestAddtoCart() throws Exception{
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
			swingsPage.clickOnImage();
			Thread.sleep(1000);
			
			SwingProductPage product = new SwingProductPage(driver);
			product.clickOnAddToCart();
			
			SwingCheckoutPage swingcheckout = new SwingCheckoutPage(driver);
			swingcheckout.clickOnCheckout();
		}
}
