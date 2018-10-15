package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import page.HomePage;
import page.SwingsPage;
import page.UserPage;

public class TestAddtoWishList extends BaseTest {

	 //Scenario 4 ----> add to wish list
		@Test
		public void TestAddToWishlist() throws Exception {
		
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
			Thread.sleep(500);
			swingsPage.addToWishList();
			
		}
}
