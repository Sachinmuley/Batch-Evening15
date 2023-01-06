package Batch_Evening13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_9_Autosuggestion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("java tutorial");
		Thread.sleep(3000);
	List<WebElement> list=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
		
		System.out.println("Size of Auto Suggestion: "+list.size());
		
		for(WebElement listitem:list)
		{
			if(listitem.getText().contains("beginners"))
			{
				listitem.click();
				System.out.println("Suggesion Passed");
				break;
			}
		}
		driver.close();
	}

}
