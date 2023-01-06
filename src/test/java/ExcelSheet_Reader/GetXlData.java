package ExcelSheet_Reader;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetXlData {
	
	 WebDriver driver;
	public String getexceldata(int rowNum,int cellNum) throws Exception
	{
		String ex="C:\\Users\\sai\\eclipse-Automation testing\\BE_13_E\\TestData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(ex);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		String data1=book.getSheet("Sheet1").getRow(rowNum).getCell(cellNum).getStringCellValue();
	
		return data1;
		
	}
   @BeforeTest	
   public void lanuchBrowser()
	{
	   WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	}
	@Test(priority=1)
   public void Emailsetup() throws Exception
	{
		WebElement ele=driver.findElement(By.xpath("//input[@name='email']"));
		ele.sendKeys(getexceldata(2,2));
		Thread.sleep(3000);
		System.out.println("Email or Mobile :"+getexceldata(2,2));
	}
	@Test(priority=2)
   public void passwordsetup() throws Exception
   {
	   WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
	   pass.sendKeys(getexceldata(3,2));
	   Thread.sleep(3000);
	   System.out.println("Password : "+getexceldata(3,2));
	}
	@Test(priority=3)
   public void clickButton()
   {
	   WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
	   button.click();
	
   }
   @AfterTest
   public void closeBrowser()
   {
	   driver.close();
	
   }
   
	

}
