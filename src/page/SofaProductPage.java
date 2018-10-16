package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SofaProductPage{

	private WebDriver driver;
	
	@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']")
    private WebElement logout;
	
	@FindBy(id="logout")
	private WebElement log;
	
	public SofaProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement logout() {
		Actions actions = new Actions(driver);
		actions.moveToElement(logout).perform();
		log.click();
		return log;
	}
}

