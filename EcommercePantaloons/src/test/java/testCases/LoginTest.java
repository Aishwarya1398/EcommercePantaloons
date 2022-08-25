package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.genericLib.Base;
import com.genericLib.Utility;

import pageObjectRepository.HomePage;
import pageObjectRepository.LoginPage;
import pageObjectRepository.PLPPage;
import pageObjectRepository.cartPage;
import pageObjectRepository.checkoutPage;

public class LoginTest extends Base{

	LoginPage Lp;
	HomePage Hp;
	PLPPage pp;
	cartPage cp;
	//checkoutPage CheckP;
	 Utility util=new Utility();
	
	
	@Test(priority = 1)
	public void loginTestCases() throws InterruptedException {
		Lp=PageFactory.initElements(driver, LoginPage.class);
		
		Lp.Login();
	}
	
	@Test(priority = 2)
	public void homeTestCases() throws InterruptedException {
		Hp=PageFactory.initElements(driver, HomePage.class);
		util=PageFactory.initElements(driver, Utility.class);
		
		Hp.validateText();
		Thread.sleep(5000);
		Hp.getWomenbtn().click();
		Hp.getFestivebtn().click();
		Thread.sleep(5000);
		Hp.getShowrecombtn().click();
		Thread.sleep(5000);
		//Hp.getDropdownbtn1().click();
		Thread.sleep(5000);
		util.initialiseSelect(Hp.getDropdownbtn1());
		//util.mouseAction(driver, Hp.bestselling());
		util.dropDownHandlebyValue("OrdersCount desc");
		Hp.validateText2();		
	}
	@Test(priority = 3)
	public void PLPTestCases() throws InterruptedException {
		pp=PageFactory.initElements(driver, PLPPage.class);
		pp.PLPTest();
	}
	
	@Test(priority = 4)
	public void cartTestCases() throws InterruptedException {
		cp=PageFactory.initElements(driver, cartPage.class);
		//util=PageFactory.initElements(driver, Utility.class);
		Thread.sleep(3000);
		driver.navigate().refresh();
		cp.cart();
	
//		cp.getDropdownbtn().click();
//		util.mouseAction(driver, cp.latest());
		util.initialiseSelect(cp.getDropdownbtn());
		util.dropDownHandlebyVisibleIndex(2);
		Thread.sleep(6000);
		System.out.println("kids dropdown is successful");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		cp.getKidimg().click();
		Thread.sleep(3000);
		cp.getKidsize().click();
		Thread.sleep(3000);
		cp.getAddCartbtn().click();
		Thread.sleep(3000);
	}
	
//	@Test(priority = 5)
//	public void checkOutTestCases() throws InterruptedException {
//		CheckP=PageFactory.initElements(driver, checkoutPage.class);
//		driver.navigate().refresh();
//		CheckP.checkout();
//		driver.navigate().refresh();
//		CheckP.check2();
//	}
	
}