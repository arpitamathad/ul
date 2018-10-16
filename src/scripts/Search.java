package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.GetScreenShot;
import generic.GetXLData;
import generic.Valid;
import generic.Wait;
import page.HomePage;
import page.SofaPage;
import page.SofaProductPage;

public class Search extends BaseTest {

	@Test
	public void SearchProduct() throws Exception {
		HomePage homePage = new HomePage(driver);
		homePage.closePOP();
		Thread.sleep(1000);
		Valid v = new Valid();
		v.verifyHomePage("Furniture Online: Buy Home Wooden Furniture in India @ 30% OFF - Urban Ladder",driver);
		homePage.hoverOnUser();
		homePage.clickOnLogin();
		String un = GetXLData.getXLData("./excel/logincredentials.xlsx", 1, 0);
		homePage.setLoginUsername(un);
		String pw = GetXLData.getXLData("./excel/logincredentials.xlsx", 1, 1);
		homePage.setLoginPassword(pw);
		homePage.clickLogin(); 
		v.verifyHomePage("Furniture Online: Buy Home Wooden Furniture in India @ 30% OFF - Urban Ladder",driver);
		homePage.search("sofas");
		SofaPage sofaPage = new SofaPage(driver);
		sofaPage.hover();
		//v.verifyHomePage(expectedTitle, driver);
		SofaProductPage s = new SofaProductPage(driver);
		GetScreenShot.getPhoto(driver, "./screenshots");
		//Wait.wait(s.logout(), driver);
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeScript("window.scrollBy(0,-100");
//		Thread.sleep(1000);
//		s.logout();
	
		
	}
}
