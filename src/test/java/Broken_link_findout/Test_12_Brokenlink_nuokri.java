package Broken_link_findout;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_12_Brokenlink_nuokri {
	
	WebDriver driver;
	public void broken_link_findout(String str,WebElement singlelink) throws Exception
	{
		URL url=new URL(str);
		HttpURLConnection http=(HttpURLConnection) url.openConnection();
		http.setConnectTimeout(3000);
		http.connect();
		
		if(http.getResponseCode()==200)
		{
			System.out.println("URL is fine : "+singlelink.getText());
		}
		else
		{
			System.out.println("URL is broken : "+singlelink.getText());
			
		}
	}
	@Test
	public void cheacking() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
		
		List<WebElement> List=driver.findElements(By.xpath("//a"));
		System.out.println("size of fine : "+List.size());
		System.out.println();
		Iterator<WebElement> it=List.iterator();
		 
		 while(it.hasNext())
		 {
			 WebElement singleLink=it.next();
			 String urllink=singleLink.getAttribute("href");
			 try
			 {
				 broken_link_findout(urllink, singleLink);
			 }
			 catch(Exception e)
			 {
				 System.out.println("exception found");
			 }
			 
		 }
		 Thread.sleep(3000);
		 driver.close();
		
	}
	
	

}
