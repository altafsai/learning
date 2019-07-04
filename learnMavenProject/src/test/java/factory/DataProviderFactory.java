package factory;

import dataProvider.Exceldataprovider;
import dataProvider.configDataProvider;

public class DataProviderFactory extends BrowserFactory
{

	public static Exceldataprovider getExcel()
	{
		Exceldataprovider excel= new Exceldataprovider();
		return excel;
		
	}
	
	public static configDataProvider getConfig()
	{
		configDataProvider config= new configDataProvider();
		return config;
		
	}
}
