package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
	public WebDriver driver;

	public WebDriver Browserget(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
		    System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().ChromePath());
            driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("ie"))
		{
		    System.setProperty("webdriver.ie.driver", DataProviderFactory.getConfig().iePath());
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	    return driver;
	}
	
    public void closeUp()
    {
	    driver.close();
        }
}
