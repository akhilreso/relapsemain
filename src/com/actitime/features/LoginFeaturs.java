package com.actitime.features;

import org.openqa.selenium.WebDriver;

import com.actitime.pageobjets.LoginPage;

// here we write code for module or prossess
//inside the featurs class we creat non static method which repragent one featur
//by calling the webelement from pom class 
public class LoginFeaturs 
{
	

		WebDriver driver;
		LoginPage lp;

		public  LoginFeaturs(WebDriver driver)
		{
		this.driver=driver;
		lp = new LoginPage(driver);

		}
		public void login() //String username, String password
		{
			lp.getUnTextBox().sendKeys("admin");
			lp.getPawd().sendKeys("manager");
			lp.getLoginB().click();
			
		
		}
}