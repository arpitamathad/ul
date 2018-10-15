package scripts;

import org.testng.Assert;

import generic.BaseTest;
import generic.GetXLData;
import page.HomePage;
import page.SwingsPage;
import page.UserPage;

public class TestRemoveFromWishList extends BaseTest {

	public void TestRemoveFromWishList() throws Exception {
		
	HomePage homePage = new HomePage(driver);
	homePage.closePOP();
	Thread.sleep(1000);
	homePage.hoverOnUser();
	homePage.clickOnLogin();
	Thread.sleep(1000);
	String un = GetXLData.getXLData("./excel/logincredentials", 1, 0);
	System.out.println(un);
	homePage.setLoginUsername(un);
	String pw = GetXLData.getXLData("./excel/logincredentials", 1, 1);
	System.out.println(pw);
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