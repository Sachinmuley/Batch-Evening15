package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utility.Library;

public class ExcelDataReader {

	public static void main(String[] args) throws Exception {
		
	String 	filepath="C:\\Users\\sai\\eclipse-Automation testing\\BE_13\\TestData\\Data.xlsx";
		
	//object FileinputStrem
	FileInputStream fis=new FileInputStream(filepath);
	 
	//object -XSSWorkStream
	XSSFWorkbook wb=new XSSFWorkbook(fis);
    		
	//data call
	String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	String data1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	String data2=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();

	
	System.out.println(data);// Test
	System.out.println(data1);
	System.out.println(data2);
	
	
	
	// Generic method used
		
	String data11=Library.getExceldata("Sheet1", 0, 0);
	System.out.println(data11);
	String data111=Library.getExceldata("Sheet1", 0, 1);
	System.out.println(data111);
	
	
	
	

	}

}
