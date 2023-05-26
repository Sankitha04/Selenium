package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class contains elements and respective business libraries of Contact Us page
 * @author Sankitha
 *
 */
public class ContatUsPage {
	
	//Declaration
	@FindBy(xpath="//img[contains(@src,'contactus')]")
	private WebElement pageLogo;
	
	@FindBy(name="name")
	private WebElement fullNameTF;
	
	@FindBy(name="sender")
	private WebElement emailTF;
	
	@FindBy(name="subject")
	private WebElement subjectTF;
	
	@FindBy(name="message")
	private WebElement messageTextArea;
	
	@FindBy(xpath="//button[text()='Send us mail']")
	private WebElement sendUsMailButton;
	
	//Initialization
	public ContatUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	/**
	 * this method returns contact us page logo
	 * @return
	 */
	public WebElement getPageLogo() {
		return pageLogo;
	}
	/**
	 * this method is used to send contact details
	 * @param fullname
	 * @param email
	 * @param subject
	 * @param message
	 */
	public void sendDetails(String fullname,String email,String subject,String message) {
		fullNameTF.sendKeys(fullname);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageTextArea.sendKeys(message);
		sendUsMailButton.click();
	}

}
