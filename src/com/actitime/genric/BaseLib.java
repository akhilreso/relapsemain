package com.actitime.genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


  //in this class first off all we declear Wbdriver driver public and static
  //here we use @before and @aftermethod.
public class BaseLib 
{
 public static WebDriver driver;
 
  @BeforeMethod  
  //here we write code for launch the browser max and implisit wait and navigate 
  //here we add @Parameters
  @Parameters({"browsers" ,"baseurl"})
  
  public void preCondition(String browserName, String url)
  {
  driver=BrowserFactory.launchBrowser(browserName);
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //SECOND IS ENUM
  driver.get(url);
  }
  @AfterMethod
  public void postCondition()
  {
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
  driver.close();
  Reporter.log("Browser Closed", true);
 
  }
}	



