package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.genericLib.Base;

import pageObjectRepository.checkoutPage;

public class CheckoutTest extends Base {
checkoutPage CheckP;


	@Test(priority = 5)

	public void checkOutTestCases() throws InterruptedException {
		CheckP=PageFactory.initElements(driver, checkoutPage.class);
		Thread.sleep(3000);
		CheckP.Login();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		CheckP.checkout();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		CheckP.check2();
}
}
