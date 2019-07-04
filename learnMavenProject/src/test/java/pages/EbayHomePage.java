package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BrowserFactory;

public class EbayHomePage extends BrowserFactory
{
	//WebDriver driver;

	public EbayHomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
}
	
	@FindBy (xpath="//select[@id='gh-cat']") WebElement category;

	@FindBy (xpath="//input[@id='gh-ac']") WebElement searchItem;
	
	@FindBy (xpath="//input[@value='Search']") WebElement searchButton;

	
	public void clickOnCategory()
	{
		category.click();
	}
	
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	
	public void Insertdata(String data)
	{
		searchItem.sendKeys(data);
	}

	
}
