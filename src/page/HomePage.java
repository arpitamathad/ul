package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import generic.GetScreenShot;

public class HomePage {

	// Declaration
	
	private WebDriver driver ;
	
	@FindBy(id="search")
	private WebElement search; 
	
	@FindBy(xpath="(//a[contains(.,'Close')])[2]")
	private WebElement closeBTN;
	
	@FindBys({
	@FindBy(xpath="//span[@class='topnav_itemname']")})
	private List<WebElement> allElements;
	
	@FindBys({
		@FindBy(xpath="//a[@class=\"inverted\"]")})
	private List<WebElement> allLinks;
	
	@FindBy(xpath="//span[@class=\"header-icon-link user-profile-icon\"]")
	private WebElement user;
	@FindBy(xpath="//a[.=\"Sign Up\"]")
	private WebElement signUp;
	
	@FindBy(id="spree_user_email")
	private WebElement userName;
	
	@FindBy(xpath="(//input[@id='spree_user_password'])[2]")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@value=\"Sign Up\"]")
	private WebElement clickSignup;
	@FindBy(xpath="//a[.=\"Log In\"]")
	private WebElement clickOnLogin;
	
	@FindBy(xpath="(//input[@id=\"spree_user_email\"])[2]")
	private WebElement loginUserName;
	
	@FindBy(xpath="(//input[@id=\"spree_user_password\"])[3]")
	private WebElement loginPassword;
	
	@FindBy(xpath="//input[@value=\"Log In\"]")
	private WebElement clickLogin;
	
	@FindBy(xpath="//span[@class='search-icon icofont-search']")
	private WebElement clickOnSearch;
	
	// Initiatlization 
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void search(String text) {
		search.click();
		search.sendKeys(text);
		clickOnSearch.click();
	}
	//Utilization
	
	public void hoverOnUser() {
		Actions actions = new Actions(driver);
		actions.moveToElement(user).perform();
	}
	public void clickOnSignup() {
		signUp.click();
	}
	public void setUserName(String un) {
		userName.sendKeys(un);
	}
    public void setPassword(String pw) {
		passWord.sendKeys(pw);
	}
	public void clickSignup() {
		clickSignup.click();
	}
	public void clickOnLogin() {
		clickOnLogin.click();
	}
	public void clickLogin() {
		clickLogin.click();
	}
	public void setLoginUsername(String un) {
		loginUserName.sendKeys(un);
	}
	public void setLoginPassword(String pw) {
		loginPassword.sendKeys(pw);
	}
	public void closePOP() {
		closeBTN.click();
	}
	public void getNames() throws Exception {
		for(WebElement e : allElements) {
			Actions action = new Actions(driver);
			Thread.sleep(500);
			action.moveToElement(e).perform();
			Thread.sleep(500);
			GetScreenShot.getPhoto(driver, "./screenshots");
			String text = e.getText();
			System.out.println("*********************************");
			System.out.println(text);
			System.out.println("*********************************");
			String txt= text.toLowerCase();
			for(WebElement w : allLinks) {
				String s = w.getText();
				if(w.getAttribute("href").contains("topnav_"+txt))
			System.out.println(s);
			}
			
		}
	}
}
