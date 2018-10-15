package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import page.HomePage;
import page.UserPage;

public class TestLogin extends BaseTest {

	// Scenario 2 ----> Login and logout
		@Test
		public void TestLoginIn() throws Exception {
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
			userPage.mouseHover();
			userPage.logout();
		}
}
