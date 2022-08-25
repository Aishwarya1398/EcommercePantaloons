package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class checkoutPage {

	//elements
	
	
	@FindBy(xpath = "//a[@title='Cart']")
	private WebElement cartbtn1;
	
	@FindBy(xpath = "//div[.='APPLY COUPON']")
	private WebElement applycouponbtn;
	
	@FindBy(xpath = "(//button[.='APPLY'])[2]")
	private WebElement selectCouponbtn;
	
	@FindBy(xpath="//img[@title='Remove coupon']")
	private WebElement removeCouponbtn;
	
	@FindBy(xpath = "//button[.='CHECKOUT']")
	private WebElement checkoutbtn2;
	
	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement pinTF;
	
	@FindBy(xpath = "//input[@id='building']")
	private WebElement buildingTF;
	
//	@FindBy(xpath = "//input[@id='street']")
//	private WebElement streetTF;
//	
//	@FindBy(xpath = "//input[@id='area']")
//	private WebElement areaTF;
//	
//	@FindBy(xpath = "//input[@id='landmark']")
//	private WebElement landmarkTF;
//	
//	@FindBy(name = "city")
//	private WebElement CityTF;
//	
//	@FindBy(name = "state")
//	private WebElement stateTF;
	
	@FindBy(xpath = "//span[.='Add address']")
	private WebElement AddrTF;
	
	//getters
	

	public WebElement getCartbtn1() {
		return cartbtn1;
	}

	public WebElement getApplycouponbtn() {
		return applycouponbtn;
	}

	public WebElement getSelectCouponbtn() {
		return selectCouponbtn;
	}

	public WebElement getRemoveCouponbtn() {
		return removeCouponbtn;
	}

	public WebElement getCheckoutbtn2() {
		return checkoutbtn2;
	}

	public WebElement getPinTF() {
		return pinTF;
	}

	public WebElement getBuildingTF() {
		return buildingTF;
	}

//	public WebElement getStreetTF() {
//		return streetTF;
//	}
//
//	public WebElement getAreaTF() {
//		return areaTF;
//	}
//
//	public WebElement getLandmarkTF() {
//		return landmarkTF;
//	}
//
//	public WebElement getCityTF() {
//		return CityTF;
//	}
//
//	public WebElement getStateTF() {
//		return stateTF;
//	}

	public WebElement getAddrTF() {
		return AddrTF;
	}

	//Actions
	
	public void checkout() throws InterruptedException {
		Thread.sleep(3000);
		cartbtn1.click();
		Thread.sleep(6000);
	}
	public void check2() throws InterruptedException {
		Thread.sleep(3000);
		//applycouponbtn.click();
		//Thread.sleep(3000);
//		selectCouponbtn.click();
//		Thread.sleep(3000);
//		removeCouponbtn.click();
//		Thread.sleep(3000);
		checkoutbtn2.click();
		Thread.sleep(5000);
		pinTF.sendKeys("577501");
		Thread.sleep(3000);
		buildingTF.sendKeys("Banashankari layout");
		Thread.sleep(3000);
		AddrTF.click();
		
	}
	//LoginPage
	
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

