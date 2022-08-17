package com.infy.HomePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Serach_Box 
{
	@FindBy(xpath="//input[@id=\"input\"]")private WebElement SearchBox;
 
	public Serach_Box(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterSearchBox()
	{
		SearchBox.sendKeys("app"+Keys.ENTER);
	}
}
