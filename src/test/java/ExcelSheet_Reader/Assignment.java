package ExcelSheet_Reader;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {
	
	WebDriver driver;
	@BeforeTest
	public void LanuchBrowser() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void Webtable()
	{
	  List<WebElement> list= driver.findElements(By.xpath("//td[@style='border: 1px solid rgb(221, 221, 221); box-sizing: inherit; padding: 8px;']"));
		 System.out.println("Element size :"+list.size());
		
		// for(WebElement ele:list)
		 //{ 
		  int j=1;
			 for(int i=0; i<18; i++ )
			 {
				 if(i==0||i==3||i==6||i==9||i==12||i==15)
				 {
					 WebElement name= list.get(i);
					 String Companyname=name.getText();
					 System.out.println(j+".company is : "+Companyname);
					j++;
					 
				 }
			 }
			
		 }
	@AfterTest
	public void closeBrowser() throws Exception 
	{ 
		Thread.sleep(2000);
	   driver.close();	
	}

}
