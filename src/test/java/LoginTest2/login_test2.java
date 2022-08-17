package LoginTest2;



import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.infy.AddToBasket.add_to_card;

public class login_test2 extends prasad_dahale.BaseClass.Base_Class

{
	com.infy.LoginClass.Login_Page lp;
	com.infy.HomePage.Select_Multiple_Item smi;
	add_to_card ac;
	@BeforeClass
	public void BrowserLunch() throws IOException, InterruptedException
	{
		BrowserOpen();
		
		lp = new com.infy.LoginClass.Login_Page(driver);
		smi= new com.infy.HomePage.Select_Multiple_Item(driver);
		ac=new add_to_card(driver);
		
		
		lp.ClickSignin();
		Thread.sleep(3000);
		lp.enterMobileNo(com.infy.UtilityClass.Utility_Class.getPropertyFileData("Mobileno"));
		lp.ClickOnconButton();
		lp.enterotp();
		lp.verifyandcontinue();
	}
	@Test
	public void additem() throws InterruptedException
	{
		smi.scrollBy(driver);
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void addcard() throws InterruptedException
	{
		Thread.sleep(2000);
		ac.Add();
		Thread.sleep(2000);
	}

}
