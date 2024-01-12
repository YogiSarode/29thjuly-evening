package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		/*Thread.sleep(1000);
		//Actions for Double Click
		Actions act=new Actions(driver);
	    WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
         //act.doubleClick(doubleClickButton).perform();
	        //or
	    act.moveToElement(doubleClickButton).doubleClick().build().perform();*/
	    
	    
	    //Actions for Right Click
	      Thread.sleep(1000);
	      Actions act1=new Actions(driver);
	      WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
	      //act1.moveToElement(rightClickButton).contextClick().build().perform();
	      //or
	      
	      act1.contextClick(rightClickButton).perform();
	    
	}

}
