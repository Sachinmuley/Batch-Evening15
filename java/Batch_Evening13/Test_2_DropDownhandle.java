package Batch_Evening13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2_DropDownhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Browser Executiable setup
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 driver.manage().window().maximize(); 
	
		 WebElement drop_country=driver.findElement(By.xpath("//select[@name='country']"));
                  // Select sel=new Select(drop_country);
                   
//                   sel.selectByIndex(10);
//                   sel.selectByValue("ARGNTINA");
//                   sel.selectByVisibleText("ARGNTINA");
                   
         Library.customhandleDropdown(drop_country,"ARGENTINA");
	}

}
