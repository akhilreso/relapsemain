package com.actitime.pageobjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(name="username")
	private WebElement unTextBox;
	@FindBy(name="pwd")
	private WebElement pawd;
	@FindBy(id="loginButton")
	private WebElement loginB;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUnTextBox() {
		return unTextBox;
	}

	public WebElement getPawd() {
		return pawd;
	}

	public WebElement getLoginB() {
		return loginB;
	}
	
	
	
	

}
