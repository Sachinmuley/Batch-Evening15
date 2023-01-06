package Broken_link_findout;

import java.io.IOException;
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


public class Test_11_Brokenlink_Findout {
	
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
			System.out.println("URL is broken"+singlelink.getText());
		}
	}
	@Test
	public void BrokenLinkFindout() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
		
		List<WebElement> list=driver.findElements(By.xpath("//a"));
		System.out.println("size of fine : "+list.size());
		Iterator<WebElement> it=list.iterator();
		 
		 while(it.hasNext())
		 {
			 WebElement singlelink=it.next();
			 String str=singlelink.getAttribute("href");
			 broken_link_findout(str, singlelink);
			 
		 }
		 Thread.sleep(3000);
		 driver.close();
		}
	

}
