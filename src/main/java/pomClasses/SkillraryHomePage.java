package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *this class contains elements and respective business libraries of skillrary home page
 * @author Sankitha
 *
 */
public class SkillraryHomePage {
 
	//Declartion
	
	@FindBy(xpath="//img[@alt='SkillRary']")
	private WebElement logo;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsTab;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu gear_menu')]/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement skillraryDemoAppLink;
	
	//@FindBy(xpath="//ul[contains(class,'home_menu')]/li[1]")
	//private WebElement language;
	
	//@FindBy(xpath="//ul[contains(@class,'home_menu list-unstyled list-inline')]/descendant::a[text()=' English']")
	//private WebElement english;
	
	//Initialization
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	/**
	 * this method returns skillrary home page logo
	 * @return
	 */
	public WebElement getLogo() {
		return logo;
	}
	
	/**
	 * this method is used to click on gears tab
	 */
	public void clickGearsTab() {
		gearsTab.click();
	}
	
	/**
	 * this method is used to click on skillrary demo app link
	 */
	
	public void clickSkillraryDemoApp() {
		skillraryDemoAppLink.click();
	}
	
	/**
	 * this method is used to select english as default language
	 */
	//public void chooseEnglish() {
		//language.click();
		//english.click();
	//}
}
