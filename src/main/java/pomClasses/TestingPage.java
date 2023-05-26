package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class contains elements and respective business libraries of testing page
 * @author Sankitha
 *
 */
public class TestingPage {

	//Declartion
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	
	@FindBy(id="Python")
	private WebElement pythonImage;
	
	@FindBy(id="cartArea")
	private WebElement myCart;
	
	@FindBy(xpath="//ul/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	//Initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	/**
	 * this method return page header of selenium training page
	 * @return
	 */
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	/**
	 * this method is used to get python image
	 * @return
	 */
	public WebElement getPythonImage() {
		return pythonImage;
	}
	
	/**
	 * this method is used to MyCart area
	 * @return
	 */
	public WebElement getMyCart() {
		return myCart;
	}
	
	/**
	 * this method is used to get facebook icon
	 * @return
	 */
	public WebElement getFacebookIcon() {
		return facebookIcon;
	}
	
	/**
	 * this method is used to click on facebook icon
	 */
	public void clickFacebook() {
		facebookIcon.click();
	}
	
}
