package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwingProductLogout {

	private WebDriver driver;
	
	@FindBy(xpath="//li[@class='email']")
	private WebElement logoutHover;
	
	@FindBy(xpath="//span[.='Logout']")
	private WebElement logout;
	
	public SwingProductLogout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutHover() {
		Actions actions = new Actions(driver);
		actions.moveToElement(logoutHover).perform();
	}
	
	public void logout() {
		logout.click();
	}
	
}
