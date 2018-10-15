package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwingCheckoutPage {

	private WebDriver driver;

	@FindBy(id="checkout-link")
	private WebElement checkout;
	
	@FindBy(xpath="(//div[@class='icofont-cross_thin'])[2]")
	private WebElement close;
	
	public SwingCheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCheckout() {
		checkout.click();
	}
	
	public void close() {
		close.click();
	}
	
	

}
