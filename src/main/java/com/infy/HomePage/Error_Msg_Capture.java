package com.infy.HomePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Error_Msg_Capture 
{
	@FindBy(xpath="//input[@id=\"input\"]")private WebElement ErrorMsg;
	public Error_Msg_Capture(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void FindErrorMsg()
	{
		ErrorMsg.sendKeys("pyteidhakdgg"+Keys.ENTER);
	}

}
