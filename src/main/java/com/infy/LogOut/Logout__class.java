package com.infy.LogOut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout__class 
{
//	
//	@FindBy(xpath="(//span[@class=\"new-caret\"])[1]")private WebElement Profile;
	@FindBy(xpath="//a[@qa=\"logout\"]")private WebElement LogOut;
	public Logout__class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//	public void clickonprofile() throws InterruptedException
//	{
//		
//		Profile.click();
//		Thread.sleep(2000);
//	}
	public void clickOnLOGOUT() throws InterruptedException
	{
		Thread.sleep(2000);
		LogOut.click();
		
	}

}
