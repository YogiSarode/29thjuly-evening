package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{

	public static void main(String[] args) 
	{
		//identify table
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.name("BookTable")); //to find the web table in webpage
		
		//how many rows in table
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		int numberOfRows=rows.size();
		System.out.println("Number of rows in table: "+numberOfRows);
		
		//how many columns in table
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		int numberOfColumns=headers.size();
		
		System.out.println("Number of columns in table: "+numberOfColumns);
		
	}
	

}
