package com.infy.UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class 
{
	static Workbook wbook;
	static String path;
	static FileInputStream f;

	public static  boolean TestData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		path = "D:\\workplace\\prasad_dahale\\TestData\\Big_Basket.xlsx";
		f = new FileInputStream(path);
		wbook = WorkbookFactory.create(f);
		boolean TestValue = wbook.getSheet("sheet1").getRow(rowIndex).getCell(cellIndex).getBooleanCellValue();
		return TestValue;
	}
	public static String getPropertyFileData(String key) throws IOException
	{
		Properties PropObj = new Properties();
		FileInputStream fileObj = new FileInputStream(System.getProperty("user.dir")+"\\Prop.properties");
		PropObj.load(fileObj);
		String value = PropObj.getProperty(key);
		return value;
	}
	public static void Screenshot(WebDriver driver ) throws IOException
	{
		Date d = new Date();
		String timpStamp = d.toString().replace(" ", "_").replace(":", "_");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\workplace\\prasad_dahale\\ScreenShot\\"+timpStamp+".png");
		FileHandler.copy(src, dest);
	}

}
