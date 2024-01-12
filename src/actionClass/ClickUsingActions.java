package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		//1. find out the locator of webElement Where we need to perform action and store in some reference variable.
          WebElement loginButton = driver.findElement(By.name("login"));
          
          //2. Create an Object of an action class Which will accept driver object as a parameter
           Actions act = new Actions(driver);
           
           //3. Using one of the actions class methods perform an action
           
           //act.moveToElement(loginButton).perform();
          // act.click().perform();
           
                   //or
           
          // act.moveToElement(loginButton).click().build().perform();
           
                    //or
           
           act.click(loginButton).perform();
          
	}

}
