package com.infy.AddToBasket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class add_to_card 
{
	@FindBy(xpath="//*[@id=\"0adec232-8505-4716-a677-e750bc7a907f\"]/div[1]/div/div[1]/div/div/product-template-in-container/div[1]/div[4]/div[3]/div/div[5]/div[2]/button")private WebElement addtocard;
	public add_to_card(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Add()
	{
		addtocard.click();
	}
}
