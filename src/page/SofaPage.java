package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SofaPage {

	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='product-img'])[1]")
	private WebElement hoverOnImage;
	
	public SofaPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void hover() {
		Actions actions = new Actions(driver);
		actions.moveToElement(hoverOnImage).perform();
		hoverOnImage.click();
	}
	
}
