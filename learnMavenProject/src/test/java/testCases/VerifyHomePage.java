package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.EbayHomePage;
import pages.EbayHomePage2;

public class VerifyHomePage extends BrowserFactory
{

	@Test
	public void setUp() throws Exception
	{   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\altaf\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.ebay.com");
		
		
	/*	BrowserFactory bf= new BrowserFactory();
		bf.Browserget("Chrome");
		driver.get(DataProviderFactory.getConfig().appURL());*/
		
		EbayHomePage ebay= PageFactory.initElements(driver, EbayHomePage.class);
		ebay.Insertdata("Samsung S7");
		ebay.clickOnCategory();
		Thread.sleep(5000);
		ebay.clickOnSearchButton();
		
		EbayHomePage2 ebay2= PageFactory.initElements(driver, EbayHomePage2.class);
		ebay2.clickOnUnlockedButton();
		ebay2.clickOnProductSelection();
		ebay2.clickOnColor();
		

		
	}
	
	
	
	
	
}
