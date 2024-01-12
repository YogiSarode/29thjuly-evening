package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/ ");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		  WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		  Select drpdwn=new Select(dropdown);
		  //drpdwn.selectByIndex(1);  // by selectIndex(note: Index values always starts with 0)
		  //drpdwn.selectByValue("option1"); //by selectValue
		  drpdwn.selectByVisibleText("Option3");  //by select text.
		  
		  boolean result = drpdwn.isMultiple();    //isMultiple() is used to check  whether given dropdown is multiple selectable or not.
		  System.out.println(" dropdown is multiple selectable  "+result);
		  
		
	}

}
