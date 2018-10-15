package scripts;
//completed
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.GetXLData;
import generic.Valid;
import page.HomePage;
import page.SwingsPage;
import page.UserPage;

public class TestRemoveFromWishList extends BaseTest {

	@Test
	public void TestRemoveFromWishList() throws Exception {
		
	HomePage homePage = new HomePage(driver);
	homePage.closePOP();
	Valid v = new Valid();
	v.verifyHomePage("Furniture Online: Buy Home Wooden Furniture in India @ 30% OFF - Urban Ladder",driver);
	Thread.sleep(1000);
	homePage.hoverOnUser();
	homePage.clickOnLogin();
	Thread.sleep(1000);
	String un = GetXLData.getXLData("./excel/logincredentials.xlsx", 1, 0);
	System.out.println(un);
	homePage.setLoginUsername(un);
	String pw = GetXLData.getXLData("./excel/logincredentials.xlsx", 1, 1);
	System.out.println(pw);
	homePage.setLoginPassword(pw);
	homePage.clickLogin();
	v.verifyHomePage("Furniture Online: Buy Home Wooden Furniture in India @ 30% OFF - Urban Ladder",driver);
	UserPage userPage = new UserPage(driver);
	userPage.selectLivingModule();
	Thread.sleep(500);
	userPage.clickOnSwingChairs();
	String acTitle = "Outdoor Swing Chairs: Buy Outdoor Swing Chairs Online for Best Prices in India - Urban Ladder";
	String exTitle = driver.getTitle();
	Assert.assertEquals(acTitle, exTitle);
	Reporter.log("product page successfully displayed!!!",true);
	SwingsPage swingsPage = new SwingsPage(driver);
	Thread.sleep(1000);
	swingsPage.hoverImage();
	Thread.sleep(1000);
	swingsPage.addToWishList();
	Thread.sleep(2000);
	swingsPage.hoverImage();
	swingsPage.removeFromWishList();
	JavascriptExecutor j = (JavascriptExecutor) driver; 
	j.executeScript("window.scrollBy(0,-200)");
	userPage.mouseHover();
	userPage.logout();
	v.verifyHomePage("Furniture Online: Buy Home Wooden Furniture in India @ 30% OFF - Urban Ladder",driver);
}
}