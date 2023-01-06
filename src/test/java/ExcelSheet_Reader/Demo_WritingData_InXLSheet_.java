package ExcelSheet_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_WritingData_InXLSheet_ {
	
	WebDriver driver;
	
	public void SetExcelSheet(String sheetname,int rowNum,int cellNum,String setdataVal) throws Exception 
	{
	   	String excelPath="C:\\Users\\sai\\eclipse-Automation testing\\BE_13_E\\TestData\\WritingInDataExcelSheet.xlsx";
        File file=new File(excelPath);
        FileInputStream fis=new FileInputStream(file);
        XSSFWorkbook work=new XSSFWorkbook(fis);
        
        XSSFSheet sheet=work.getSheet(sheetname);
        sheet.getRow(rowNum).createCell(cellNum).setCellValue(setdataVal);
        FileOutputStream fos=new FileOutputStream(new File(excelPath));
        work.write(fos);
        System.out.println("value set is : "+setdataVal);
        fos.close();
        work.close();
      }
	
	@Test
	public void getandwriteWebTable() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> headersofTable=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//th"));
		
		int headers=headersofTable.size();
		
		for (int i=0; i<=0; i++) 
		 {
			for (int j=1; j<=headers; j++)
			 {
				Thread.sleep(1000);
				String headvalue=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr//th["+j+"]")).getText();
				SetExcelSheet("Sheet1",i,j-1, headvalue);
			}
		}
		
		List<WebElement> allTableval=driver.findElements(By.xpath("(//table[@id='customers']//tbody//tr)//td"));
		int allval=allTableval.size();
		
		for (int i=2; i<=7; i++) 
		 {
			for (int j=1; j<=3; j++)
			 {
				Thread.sleep(1000);
				WebElement tableval=driver.findElement(By.xpath("(//table[@id='customers']//tbody//tr)["+i+"]//td["+j+"]"));
				String tablevalText=tableval.getText();
				SetExcelSheet("Sheet1",i-1,j-1, tablevalText);
			  }
		}
      }
}
