package Test_NG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alphabetical_OrderExecut {
	
	//Alphabetical it is test cases is Execute in Alphabetical order.
	
	@BeforeMethod
	public void BrowserOpen() 
	{
	  System.out.println("Browser Open");	
	}
	@Test
	public void testz() 
	{
	 System.out.println("Test_z");	
	}
	@Test
	public void testb() 
	{
	 System.out.println("Test_B");	
	}
	@Test
	public void testa() 
	{
	 System.out.println("Test_a");	
	}
	
	
	@AfterMethod
	public void BrowserClose() 
	{
	   System.out.println("Browser close");	
	}

}
