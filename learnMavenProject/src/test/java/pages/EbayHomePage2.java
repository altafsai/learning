package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BrowserFactory;

public class EbayHomePage2 extends BrowserFactory
{
	WebDriver driver;

	public EbayHomePage2(WebDriver driver)
	{
		this.driver=driver;
}
	
	@FindBy (xpath="//button[@aria-label='see all - Connectivity - opens dialog']") WebElement seeAll;

	@FindBy (xpath="//input[@aria-label='Unlocked']") WebElement unlockedButton;
    
	@FindBy (xpath="//input[@aria-label='Gold']") WebElement color;
	
	//@FindBy (id="refineOverlay-subPanel-Connectivity_4G%2B_cbx") WebElement 4G;

	
	@FindBy (xpath="//input[@aria-label='Samsung Galaxy S7 edge']") WebElement productSelection;

	
	public void clickOnUnlockedButton()
	{
		unlockedButton.click();
	}
	
	public void clickOnProductSelection()
	{
		productSelection.click();
	}
	
	public void clickOnColor()
	{
		color.click();
	}
	


	
}
