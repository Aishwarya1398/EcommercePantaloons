package com.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(com.genericLib.ListenerImp.class)

public class Base {
	public WebDriver driver;
	public static WebDriver staticdriver;
	
	@BeforeClass
	public void configBC()
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\Automation\\Drivers\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);
			staticdriver = driver;
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.pantaloons.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			Reporter.log("Browser opened", true);

	}
	
	@AfterClass
	public void configAc() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("About to quit", true);
		driver.quit();
		Reporter.log("Successfully quit", true);
	}
}
