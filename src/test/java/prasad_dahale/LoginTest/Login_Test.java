package prasad_dahale.LoginTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.infy.HomePage.Drop_Down;
import com.infy.HomePage.Error_Msg_Capture;
import com.infy.HomePage.Home_Page;
import com.infy.HomePage.Mouse_Over_Action;
import com.infy.HomePage.Serach_Box;
import com.infy.LogOut.Logout__class;
import com.infy.LoginClass.Login_Page;
import com.infy.UtilityClass.Utility_Class;

import prasad_dahale.BaseClass.Base_Class;
public class Login_Test extends Base_Class
{
	Login_Page lp;
	Home_Page hp;
    Drop_Down dd;
    Logout__class lc;
    Mouse_Over_Action moa;
    Serach_Box sb;
    Error_Msg_Capture emc;
   // Select_Multiple_Item smi;
	@BeforeTest
	public void BrowserLunch() throws IOException
	{
		BrowserOpen();
	
		lp = new Login_Page(driver);
		hp = new Home_Page(driver);
		dd = new Drop_Down(driver);
		lc = new Logout__class(driver);
		moa = new Mouse_Over_Action(driver);
		sb = new Serach_Box(driver);
		emc = new Error_Msg_Capture(driver);
		//smi= new Select_Multiple_Item(driver);
	}
	@BeforeClass
	public void SignToApp() throws IOException, InterruptedException
	{
		lp.ClickSignin();
		Thread.sleep(3000);
		lp.enterMobileNo(Utility_Class.getPropertyFileData("Mobileno"));
		lp.ClickOnconButton();
		lp.enterotp();
		lp.verifyandcontinue();
		
	}
	@Test
	public void verificationOfLogo() throws IOException, InterruptedException
	{
         boolean exp = Utility_Class.TestData(6,1);
         boolean actlogo = hp.verifyLogo();
        Assert.assertEquals(exp, actlogo,"please provide correct Logo");
		 Utility_Class.Screenshot(driver);
		 Thread.sleep(5000);
		 
	}
	@Test(priority = 1)
	public void clickshop() throws InterruptedException
	{
		Thread.sleep(5000);
		hp.navigateToShop();
		Thread.sleep(2000);

	}
	@Test(priority = 2)
	public void dropdwon() throws InterruptedException
	{
		
		dd.clickOnFood();
    	Thread.sleep(2000);
	}
	@Test(priority = 3)
	public void mouseover() throws InterruptedException
	{
		Thread.sleep(2000);
		moa.MouseAction(driver);
		Thread.sleep(2000);
	}
	@Test(priority = 4)
	public void searchbox() throws InterruptedException
	{
		Thread.sleep(2000);
		sb.enterSearchBox();
		Thread.sleep(2000);
	}
	@Test(priority = 5)
	public void error() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		emc.FindErrorMsg();
		 Utility_Class.Screenshot(driver);
	}
//	@BeforeMethod
//	public void additem() throws InterruptedException
//	{
//		smi.scrollBy(driver);
//		Thread.sleep(2000);
//	}
	@Test(priority = 10)
	public void logout() throws InterruptedException
	{
		Thread.sleep(2000);
		dd.navigateprofile();
		lc.clickOnLOGOUT();
	}

    @AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
