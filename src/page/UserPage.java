package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	// initialization
	private WebDriver driver;
	
	@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']")
	private WebElement hover;
	@FindBy(xpath="//a[.=\"Logout\"]")
	private WebElement logout;
	@FindBy(xpath="//li[@class=\"topnav_item livingunit\"]")
	private WebElement living;
	@FindBy(xpath="//span[.=\"Swing Chairs\"]")
	private WebElement swingchair;
	
	// declaration
	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// utilization
	public void selectLivingModule() {
		Actions actions = new Actions(driver);
		actions.moveToElement(living).perform();
	}
	public void clickOnSwingChairs() {
		swingchair.click();
	}
	public void mouseHover() {
		Actions actions = new Actions(driver);
		actions.moveToElement(hover).perform();
	}
	
	public void logout() {
		logout.click();
	}
}
