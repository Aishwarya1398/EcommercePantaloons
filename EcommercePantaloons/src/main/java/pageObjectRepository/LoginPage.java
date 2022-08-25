package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.genericLib.Base;

public class LoginPage extends Base{

	
	//Elements
	
//	@FindBy(xpath="//button[contains(text(),'Allow')]")
//	private WebElement allowbtn;
	
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement myAccount;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(xpath="//span[@class='MuiButton-label']")
	private WebElement getOtp;

	@FindBy(xpath="//span[contains(text(),'Start Shopping')]")
	private WebElement startshopping;
	
	//getters method
	
//	public WebElement getAllowbtn() {
//		return allowbtn;
//	}

	public WebElement getStartshopping() {
		return startshopping;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getGetOtp() {
		return getOtp;
	}

	
	//Actions
	
	public void Login() throws InterruptedException {
//		allowbtn.click();
		myAccount.click();
		Thread.sleep(2000);
		//System.out.println("MyACcount clicked");
		phone.sendKeys("8660189198");
		getOtp.click();
		Thread.sleep(40000);
		startshopping.click();
		Thread.sleep(2000);
		Reporter.log("Login Successfully", true);
	}
}
