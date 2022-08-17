package prasad_dahale.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.infy.UtilityClass.Utility_Class;

public class Base_Class 
{
	 protected static WebDriver driver = null;
	
	public static void BrowserOpen() throws IOException
	{
		String key ="webdriver.chrome.driver";
		String value ="D:\\workplace\\prasad_dahale\\SoftFiles\\chromedriver_win32\\chromedriver.exe";
		String URL =(Utility_Class.getPropertyFileData("URL"));

		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
	}
}
