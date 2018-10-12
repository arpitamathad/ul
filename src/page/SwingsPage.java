package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwingsPage {

	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='product-img'])[1]")
	private WebElement hoverOnImage;
	
	@FindBy(xpath="(//a[@class='product-img'])[2]")
	private WebElement hoverOnImage1;
	
	@FindBy(xpath="//a[.=\"View Product\"]")
	private WebElement clickOnProduct;
	
	@FindBy(xpath="(//span[.=\"Add to Wishlist\"])[1]")
	private WebElement clickOnWishlist;
	
	@FindBy(xpath="(//a[.='Add to Compare'])[1]")
	private WebElement add;
	
	@FindBy(xpath="(//a[@class=\"button button-with-border add-to-compare\"])[2]")
	private WebElement add1;
	
	@FindBy(xpath="//button[@id='compare-cta']")
	private WebElement compare;
	
	public SwingsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void hoverImage() throws Exception {
		JavascriptExecutor j = (JavascriptExecutor) driver; 
		j.executeScript("window.scrollBy(0,100)");
		Actions actions = new Actions(driver);
		Thread.sleep(500);
		actions.moveToElement(hoverOnImage).perform();	
		Thread.sleep(1000);
	}
	public void clickOnAddtoCompare() {
		add.click();
	}
	
	public void hoverImage1() throws Exception {
		JavascriptExecutor j = (JavascriptExecutor) driver; 
		j.executeScript("window.scrollBy(0,100)");
		Actions actions = new Actions(driver);
		Thread.sleep(500);
		actions.moveToElement(hoverOnImage1).perform();	
		Thread.sleep(1000);
	}
	public void clickOnAddtoCompare1() {
		add1.click();
	}
	public void clickOnCompare() {
		compare.click();
	}
	public void addToWishList() {
		clickOnWishlist.click();
	}
	public void clickOnImage() {
		hoverOnImage.click();
	}
	
}
