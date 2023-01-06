package Batch_Evening13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_5_Action_Mousmovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Browser  setup
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 driver.manage().window().maximize(); 
		 
		//Action ---->WebElement ------>Mouse Mover
		 
		 WebElement link_selenium=driver.findElement(By.xpath(""));
		 
		 Actions act=new Actions(driver);
		 act.moveToElement(link_selenium).click().build().perform();
		
	  //Drag and drop
		 WebElement src=driver.findElement(By.xpath(""));
		 
		 WebElement dest=driver.findElement(By.xpath(""));
		 
		 act.dragAndDrop(src,dest).build().perform();
		 
		 
		 
		
		
		
		
		
		
	}

}
