package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import page.HomePage;
import page.SwingsPage;
import page.UserPage;

public class TestToCompare extends BaseTest {


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
