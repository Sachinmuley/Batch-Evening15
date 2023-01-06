package ExcelSheet_Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DemoExcelSheet_Reader {
	@Test
	public void getsheetdata() throws Exception
	{
		String excelPath="C:\\Users\\sai\\eclipse-Automation testing\\BE_13_E\\TestData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(excelPath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		String data1=workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		String data2=workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data2);
	}
	
	
	
	

}
