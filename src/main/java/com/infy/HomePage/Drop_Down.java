package com.infy.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Drop_Down
{
	@FindBy(xpath="(//li[@data-submenu-id=\"foodgrains-oil-masala\"])[2]")private WebElement FoodGrainsANDMasala;
	
	@FindBy(xpath="(//span[@class=\"new-caret\"])[1]")private WebElement Profile;
	public Drop_Down(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnFood() throws InterruptedException
	{
		FoodGrainsANDMasala.click();
		Thread.sleep(2000);
	}
	public void navigateprofile() throws InterruptedException
	{
		
		Profile.click();
		Thread.sleep(2000);
	}
	
}
