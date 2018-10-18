package scripts;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
//completed
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.GetXLData;
import generic.Valid;
import page.HomePage;
import page.SwingsPage;
import page.UserPage;

public class TestToCompare extends BaseTest {


	 // Scenario 5 ----> compare two products 
	@Test
	public void TestCompare() throws Exception {
		HomePage homePage = new HomePage(driver);
		homePage.closePOP();
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
		//driver.findElement(By.xpath("(//div[@class=\"icofont-cross\"])[4]")).click();
		swingsPage.clickOnCompare();
	}
}
