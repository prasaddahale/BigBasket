package com.infy.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{
	@FindBy(xpath="//a[@qa=\"bbLogo\"]")private WebElement actualLogo;
	@FindBy(xpath="//i[@style=\"float: right;margin-top: 8px;margin-right: 5px;\"]")private WebElement ShopByCategory;
	//li[@class="dropdown full-wid hvr-drop open"]
	//a[@qa=\"categoryDD\"]
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//verify logo
	public boolean verifyLogo()
	{
		boolean actlogo = actualLogo.isDisplayed();
		return actlogo;
	
	}
     
	public void navigateToShop() throws InterruptedException
	{
		Thread.sleep(2000);
		ShopByCategory.click();
		
	
	}



}
