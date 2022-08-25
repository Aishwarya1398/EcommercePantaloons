package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.genericLib.Base;

public class HomePage extends Base {

	//Elements
	
	@FindBy(xpath = "//div[@class='welcome-text']")
	private WebElement homeText;

	@FindBy(xpath="//a[contains(text(),'FREE SHIPPING')]")
	private WebElement Freeship;
	
	@FindBy(xpath="//span[contains(text(),'women')]")
	private WebElement womenbtn;
	
	@FindBy(xpath="//span[contains(text(),'Festive')]")
	private WebElement Festivebtn;
	
	@FindBy(xpath="//span[@class='MuiSlider-thumb MuiSlider-thumbColorPrimary' and @style='left: 96%;']")
	private WebElement slidderbtn;
	
	@FindBy(xpath="//span[contains(text(),'Show Recommendations')]")
	private WebElement showrecombtn;
	
	@FindBy(xpath="//select[@class='MuiSelect-root MuiSelect-select MuiInputBase-input MuiInput-input']")
	private WebElement dropdownbtn1;
	
	@FindBy(xpath = "(//option[contains(text(),'')])[2]")
	private WebElement bestsellingbtn;
	
	public WebElement bestselling() {
		bestsellingbtn.click();
		
		return bestsellingbtn;
	}
	//getters
	
	public WebElement getBestsellingbtn() {
		return bestsellingbtn;
	}

	public WebElement getDropdownbtn1() {
		return dropdownbtn1;
	}

	public WebElement getShowrecombtn() {
		return showrecombtn;
	}

	public WebElement getHomeText() {
		return homeText;
	}

	public WebElement getSlidderbtn() {
		return slidderbtn;
	}

	public WebElement getFreeship() {
		return Freeship;
	}
	
	public WebElement getWomenbtn() {
		return womenbtn;
	}

	public WebElement getFestivebtn() {
		return Festivebtn;
	}
	
	//Actions
	
	public void validateText() {
		String text=homeText.getText();
		System.out.println(text);
	}
		
	public void validateText2() {
		String text1=Freeship.getText();
		System.out.println(text1);
	}
	
}
