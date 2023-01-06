package Test_NG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsWiseExcute_Testcase {
	
	
	@BeforeMethod
	public void BrowserOpen() 
	{
	  System.out.println("Browser Open");	
	}
	@Test(groups={"sanity"})
	public void test1()
	{
		System.out.println("sanity 1");
	}
	@Test(groups={"sanity"})
	public void test2()
	{
		System.out.println("sanity 2");
	}
	@Test(groups={"sanity"})
	public void test3()
	{
		System.out.println("sanity 3");
	}
	@Test(groups={"Regression"})
	public void test4()
	{
		System.out.println("regression 1");
	}
	@Test (groups= {"Regression"})
	public void test5()
	{
		System.out.println("regression 2");
	}
	@AfterMethod
	public void BrowserClose() 
	{
	   System.out.println("Browser close");	
	}


}
