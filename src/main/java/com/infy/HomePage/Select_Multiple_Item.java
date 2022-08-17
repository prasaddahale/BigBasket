package com.infy.HomePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Multiple_Item 
{
	@FindBy(xpath="//h2[@class=\"section-title ng-binding\"]")private WebElement mysmartbasket;
	public Select_Multiple_Item(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void scrollBy(WebDriver driver)
	{
		int x = mysmartbasket.getLocation().getX();
		int y = mysmartbasket.getLocation().getY();
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy("+x+","+y+")");
		
	}
	
}
