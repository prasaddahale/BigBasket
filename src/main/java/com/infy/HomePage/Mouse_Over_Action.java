package com.infy.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mouse_Over_Action 
{
	@FindBy(xpath="//li[@class=\"dropdown add-drop ng-scope\"]")private WebElement source;
    public Mouse_Over_Action(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
	public void MouseAction(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(source).perform();
	}
}
