package generic;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import page.HomePage;

public class Valid extends BaseTest {

	public void verifyHomePage(String expectedTitle,WebDriver driver) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log("HomePage displayed succesfully!!!!",true);
	}
}
