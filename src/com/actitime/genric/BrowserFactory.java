package com.actitime.genric;

import org.openqa.selenium.WebDriver;

//Here we write the code launch browser according requirement.

public class BrowserFactory 
{
	public static WebDriver launchBrowser(String browserName) 
	{
		

		   WebDriver driver = null;
			if(browserName.equalsIgnoreCase("chrome")) 
			{

			System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe" );
	}
			return driver;
	} }

