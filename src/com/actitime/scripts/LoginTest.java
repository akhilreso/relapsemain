package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.features.LoginFeaturs;
import com.actitime.genric.BaseLib;

// All the script 
public class LoginTest extends BaseLib
{
	@Test
	public void validLogin() 
	{
	   LoginFeaturs lf = new LoginFeaturs(driver) ;	
	   lf.login();
	}
	
	//@Test
	//public void invalidLOgin

}
