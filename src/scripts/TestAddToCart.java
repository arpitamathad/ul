package scripts;
//completed
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.GetXLData;
import generic.Valid;
import page.HomePage;
import page.SwingCheckoutPage;
import page.SwingProductLogout;
import page.SwingProductPage;
import page.SwingsPage;
import page.UserPage;

public class TestAddToCart extends BaseTest {

	// Scenario 3 ----> add to cart til checkout 
		@Test
		public void TestAddtoCart() throws Exception{
			HomePage homePage = new HomePage(driver);
			homePage.closePOP();
			System.out.println("closed");
			Valid v = new Valid();
			v.verifyHomePage("Furniture Online: Buy Home Wooden Furniture in India @ 30% OFF - Urban Ladder",driver);
			Thread.sleep(1000);
			homePage.hoverOnUser();
			homePage.clickOnLogin();
			Thread.sleep(1000);
			String un = GetXLData.getXLData("./excel/logincredentials.xlsx", 1, 0);
			homePage.setLoginUsername(un);
			String pw = GetXLData.getXLData("./excel/logincredentials.xlsx", 1, 1);
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
			SwingsPage swingsPage = new SwingsPage(driver);
			Thread.sleep(1000);
			swingsPage.hoverImage();
			swingsPage.clickOnImage();
			Thread.sleep(1000);
			String actTitle = "Calabah Swing Chair - Urban Ladder";
			String expTitle = driver.getTitle();
			Assert.assertEquals(actTitle, expTitle);
			SwingProductPage product = new SwingProductPage(driver);
			product.clickOnAddToCart();
			
			SwingCheckoutPage swingcheckout = new SwingCheckoutPage(driver);
			swingcheckout.clickOnCheckout();
			Thread.sleep(1000);
			
			SwingProductLogout s = new SwingProductLogout(driver);
			s.logoutHover();
			s.logout();
		}
}
