package Batch_Evening13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_4_Scrolling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//Browser  setup
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize(); 
	
	//Scroll Pixel
	 JavascriptExecutor js=(JavascriptExecutor) driver;	 
	  js.executeScript("window.scrollBy(0,500)","");
	  
	 Thread.sleep(3000);
	 
	 js.executeScript("window.scrollBy(0,-500)","");
	 
	//Scroll by Webelement
	 
	 WebElement English_link=driver.findElement(By.xpath(""));
	 js.executeScript("arguments[0].scrollIntoView()",English_link);
	 
	 //Generic method used in Scrolling
	  
	 Library.Scroll_Element(driver, English_link);
	
	
	}

}
