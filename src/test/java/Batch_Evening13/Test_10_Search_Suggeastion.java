package Batch_Evening13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_10_Search_Suggeastion {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	WebElement	search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Laptop");
		Thread.sleep(3000);
		
 List<WebElement> list=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));	
               System.out.println(list.size());	
 
 WebElement suggestion=driver.findElement(By.xpath("//div[@aria-label='laptop stand']"));
		suggestion.click();
	
		
		
		
		
		
		
		
		
		
		
	}
		
	}
	
	


