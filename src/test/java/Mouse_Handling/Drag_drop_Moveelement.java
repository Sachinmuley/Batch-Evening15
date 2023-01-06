package Mouse_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_drop_Moveelement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	     //MouseHoure
		 //Drag and drop
		Actions act=new Actions(driver);
		 WebElement src=driver.findElement(By.xpath("//a[normalize-space()='LOAN']"));
		 
		 WebElement dest=driver.findElement(By.xpath("//div[@id='shoppingCart1']//h3[@class='ui-widget-header'][normalize-space()='Account']"));
		 
		 act.dragAndDrop(src, dest).build().perform();
		 //act.dragAndDrop(src,dest).build().perform();
		
		


	}

}
