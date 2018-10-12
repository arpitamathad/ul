package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwingProductPage {

	private WebDriver driver;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addToCart;
	
	public SwingProductPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddToCart() {
		addToCart.click();
	}
}
