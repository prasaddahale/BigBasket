package com.infy.LoginClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page
{
  @FindBy(xpath="(//a[@qa='loginLink'])[2]")private WebElement Signinbutton;
  @FindBy(xpath="//input[@id=\"otpEmail\"]")private WebElement MobileNo;
  @FindBy(xpath="(//button[@type=\"submit\"])[1]")private WebElement Continuebutton;
  @FindBy(xpath="//input[@id=\"otp\"]")private WebElement OTP;
  @FindBy(xpath="(//button[@type=\"submit\"])[1]")private WebElement VerifyAndContinue;
  public Login_Page(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  //click on signin
  public void ClickSignin() throws InterruptedException
  {
	  Signinbutton.click(); 
	  Thread.sleep(2000);
  }
  //enter number
  public  void enterMobileNo(String mono) throws InterruptedException
  {
	  MobileNo.sendKeys(mono); 
	  Thread.sleep(2000);
  }
  //click on continue
  public void ClickOnconButton() throws InterruptedException
  {
	  Continuebutton.click();
	  Thread.sleep(2000);
  }
  //enter otp
  public void enterotp() throws InterruptedException
  {
	  OTP.click();  
	  Thread.sleep(2000);
  }
 // click on 
public void verifyandcontinue() throws InterruptedException
{
	VerifyAndContinue.click();
	Thread.sleep(2000);
}
}
