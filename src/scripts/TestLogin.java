package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.GetXLData;
import generic.Valid;
import page.HomePage;
import page.UserPage;

public class TestLogin extends BaseTest {

	// Scenario 2 ----> Login and logout
		@Test
		public void TestLoginIn() throws Exception {
			HomePage homePage = new HomePage(driver);
			homePage.closePOP();
			Valid v = new Valid();
			v.verifyHomePage("Furniture Online: Buy Home Wooden Furniture in India @ 30% OFF - Urban Ladder",driver);
			Thread.sleep(1000);
			homePage.hoverOnUser();
			homePage.clickOnLogin();
			Thread.sleep(1000);
			String un = GetXLData.getXLData("./excel/logincredentials", 1, 0);
			homePage.setLoginUsername(un);
			String pw = GetXLData.getXLData("./excel/logincredentials", 1, 1);
			homePage.setLoginPassword(pw);
			homePage.clickLogin();
			v.verifyHomePage("Furniture Online: Buy Home Wooden Furniture in India @ 30% OFF - Urban Ladder",driver);
			UserPage userPage = new UserPage(driver);
			userPage.mouseHover();
			userPage.logout();
		}
}
