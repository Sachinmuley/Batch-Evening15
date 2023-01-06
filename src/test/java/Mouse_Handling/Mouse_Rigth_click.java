package Mouse_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Rigth_click {

	public static void main(String[] args) throws Exception {
	 
	//Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
   // Mouse Rigth Click
		Actions act=new Actions(driver);
		
		WebElement  rigthclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		 
		WebElement quite=driver.findElement(By.xpath("//span[normalize-space()='Quit']"));
		act.contextClick(rigthclick).click(quite).build().perform();
  
  //Double click
		WebElement double_click=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		act.doubleClick(double_click).build().perform();
		          
  //MouseHoure
		 //Drag and drop
		 WebElement src=driver.findElement(By.xpath(""));
		 
		 WebElement dest=driver.findElement(By.xpath(""));
		 
		 act.dragAndDrop(src,dest).build().perform();
	}

}
