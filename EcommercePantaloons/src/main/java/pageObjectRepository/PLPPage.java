package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PLPPage {

	//elements
	
	@FindBy(xpath="//img[@alt='Teal Embroidered Dress With Dupatta']")
	private WebElement prod1;
	
	@FindBy(xpath="//span[text()='S']")
	private WebElement sizebtn;
	
	@FindBy(xpath="//span[text()='ADD TO BAG']")
	private WebElement Bagbtn;
	
//	@FindBy(xpath="//div[@class='minicart_mini-cart-product-title__1VvU9']//a[text()='Navy Solid Top']")
//	private WebElement minicartprod1;
	
	@FindBy(xpath="//a[@title='Cart']")
	private WebElement CartIconbtn;


	//getters
	
	public WebElement getProd1() {
		return prod1;
	}

	public WebElement getSizebtn() {
		return sizebtn;
	}

	public WebElement getBagbtn() {
		return Bagbtn;
	}

//	public WebElement getMinicartprod1() {
//		return minicartprod1;
//	}

	public WebElement getCartIconbtn() {
		return CartIconbtn;
	}

	
	//Actions
	
	public void PLPTest() throws InterruptedException {
		Thread.sleep(8000);
		prod1.click();
		Thread.sleep(3000);
		sizebtn.click();
		Thread.sleep(3000);
		Bagbtn.click();
		Thread.sleep(3000);
		//validateMiniCartprod();
		//Thread.sleep(3000);
		CartIconbtn.click();
		Thread.sleep(3000);
		
	}

}
