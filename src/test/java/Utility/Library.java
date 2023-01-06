package Utility;

import java.io.File;
import java.io.FileInputStream;


import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Library {
	
	
	public static void customhandleDropdown(WebElement element,String value)
	 {
		 
		 Select sel=new Select(element);
		  sel.selectByVisibleText(value);
		 
	 }
	public static void screenshot(WebDriver driver) throws Exception
	{
		 String rm=RandomString.make(5); // random string take screen shot
	     TakesScreenshot ts=(TakesScreenshot) driver;
	       File src=ts.getScreenshotAs(OutputType.FILE);
	       
	       File destn=new File("C:\\Users\\sai\\eclipse-Automation testing\\BE_13\\Capture\\"+rm+".png");
	       
	       FileUtils.copyFile(src, destn);
	}
	public static void Scroll_Element(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",element);
	}
	public static String getExceldata(String sheetname,int row,int cell) throws Exception
	{
		
	String 	filepath="C:\\Users\\sai\\eclipse-Automation testing\\BE_13\\TestData\\Data.xlsx";
		
	//object FileinputStrem
	FileInputStream fis=new FileInputStream(filepath);
	 
	//object -XSSWorkStream
	XSSFWorkbook wb=new XSSFWorkbook(fis);
    		
	//data call
	String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue(); 
	 return data;
	}



}
