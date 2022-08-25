package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartPage {
	
	//elemenets
	
//	@FindBy(xpath="//a[@title='Cart']")
//	private WebElement cartbtn;
	
	@FindBy(xpath="(//img[@alt='delete product'])[1]")
	private WebElement Removebtn;
	
	@FindBy(xpath = "//button[text()='REMOVE']")
	private WebElement Removebtn2;

	@FindBy(xpath="//button[text()='CHECKOUT']")
	private WebElement Checkoutbtn;
	
	@FindBy(xpath="//h2[@class='MuiTypography-root checkout_heading__v8tC1 heading MuiTypography-h2' and text()='Checkout']")
	private WebElement checkoutText;

	@FindBy(xpath="//img[@title='Pantaloons']")
	private WebElement logoBtn;
	
	@FindBy(xpath="//span[contains(text(),'Kids')]")
	private WebElement kidsbtn;
	
	@FindBy(xpath="//span[contains(text(),'Festive')]")
	private WebElement Festivebtn;
	
//	@FindBy(xpath="//span[@class='MuiSlider-thumb MuiSlider-thumbColorPrimary' and @style='left: 96%;']")
//	private WebElement slidderbtn;
	
	@FindBy(xpath="//span[contains(text(),'Show Recommendations')]")
	private WebElement showrecombtn;
	
	@FindBy(xpath="//select[@class='MuiSelect-root MuiSelect-select MuiInputBase-input MuiInput-input']")
	private WebElement dropdownbtn;
	
	@FindBy(xpath = "//select[@class='MuiSelect-root MuiSelect-select MuiInputBase-input MuiInput-input']//*[@value='product_release_date desc']")
	private WebElement latestdropdownBtn;
	
	@FindBy(xpath="//img[@alt='Navy Shirt']")
	private WebElement kidimg;
	
	@FindBy(xpath="//span[.='3-4Y']")
	private WebElement kidsize;
	
	@FindBy(xpath = "//span[.='ADD TO BAG']")
	private WebElement AddCartbtn;
	
	//getters
	
//	public WebElement getCartbtn() {
//		return cartbtn;
//	}

	public WebElement getAddCartbtn() {
		return AddCartbtn;
	}

	public WebElement getKidimg() {
		return kidimg;
	}

	public WebElement getKidsize() {
		return kidsize;
	}

	public WebElement getLatestdropdownBtn() {
		return latestdropdownBtn;
	}

	public WebElement getDropdownbtn() {
		return dropdownbtn;
	}

	public WebElement getKidsbtn() {
		return kidsbtn;
	}



	public WebElement getFestivebtn() {
		return Festivebtn;
	}

	public WebElement getShowrecombtn() {
		return showrecombtn;
	}

	public WebElement getRemovebtn() {
		return Removebtn;
	}
	
	public WebElement getRemovebtn2() {
		return Removebtn2;
	}

	public WebElement getCheckoutbtn() {
		return Checkoutbtn;
	}

	public WebElement getCheckoutText() {
		return checkoutText;
	}
	
	public WebElement getLogoBtn() {
		return logoBtn;
	}
	
	//Actions
	
	public void cart() throws InterruptedException {
		Thread.sleep(6000);
		Removebtn.click();
		Thread.sleep(3000);
		Removebtn2.click();
		Thread.sleep(3000);
		Checkoutbtn.click();
		Thread.sleep(3000);
		checkoutText.getText();
		Thread.sleep(3000);
		logoBtn.click();
		Thread.sleep(3000);
		kidsbtn.click();
		Thread.sleep(3000);
		Festivebtn.click();
		Thread.sleep(3000);
		showrecombtn.click();
		Thread.sleep(3000);
	}
 public WebElement latest() {
	 latestdropdownBtn.click();
	return latestdropdownBtn;
 }
	
}
