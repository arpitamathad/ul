package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.GetXLData;
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
			String un = GetXLData.getXLData("./excel/logincredentials", 1, 0);
			homePage.setLoginUsername(un);
			String pw = GetXLData.getXLData("./excel/logincredentials", 1, 1);
			homePage.setLoginPassword(pw);
			homePage.clickLogin(); 
			String aTitle = driver.getTitle();
			String eTitle = "Furniture Online: Buy Home Wooden Furniture in India @ 30% OFF - Urban Ladder";
			Assert.assertEquals(aTitle, eTitle);
			UserPage userPage = new UserPage(driver);
			userPage.selectLivingModule();
			Thread.sleep(500);
			userPage.clickOnSwingChairs();
			String acTitle = "Outdoor Swing Chairs: Buy Outdoor Swing Chairs Online for Best Prices in India - Urban Ladder";
			String exTitle = driver.getTitle();
			Assert.assertEquals(acTitle, exTitle);
			SwingsPage swingsPage = new SwingsPage(driver);
			Thread.sleep(1000);
			swingsPage.hoverImage();
			Thread.sleep(500);
			swingsPage.addToWishList();
			
		}
}
