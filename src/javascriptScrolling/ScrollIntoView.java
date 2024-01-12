package javascriptScrolling;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollIntoView 
{

	public static void main(String[] args) throws InterruptedException,IOException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		WebElement sponsoredCompanies = driver.findElement(By.xpath("//h2[text()='Sponsored companies']"));
		Thread.sleep(3000);
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView();",sponsoredCompanies);
		 Thread.sleep(2000);
        WebElement myElement = driver.findElement(By.xpath("//h2[text()='Top companies hiring now']"));
		js.executeScript("arguments[0].scrollIntoView();",myElement);
       
         
         //JavaScript scrollIntoView () is a method of Element class that lets us scroll an element 
		//into the viewing portion of the window. 
         
	}

}
