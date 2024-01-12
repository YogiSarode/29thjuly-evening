package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2
{

	public static void main(String[] args)
	{
		// identify webtable
	
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		 
		 //identify one header reading
		 String text1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[1]")).getText();
		 System.out.println("Header Name is: "+text1);
		 System.out.println("============================================================");
		 
		 //read all headers from row
	      List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
	      int numberOfHeaders=tableHeader.size();
	      System.out.println("Total Headers are: "+numberOfHeaders);
	      System.out.println("=============================================================");
	      for(WebElement th:tableHeader)
	      {
	    	  System.out.print(th.getText()+" ");
	    	  
	      }
		System.out.println();
		System.out.println("=============================================================");
		 
		 //print only one data from table
		
		String singleElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]/td[1]")).getText();
		System.out.println("Single data from table: "+singleElement);
		
		//How to read Complete Row
		
		List<WebElement> row1= driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]"));
	      System.out.println("=============================================================");
	      for(WebElement tr:row1)
	      {
	    	  System.out.print(tr.getText()+" ");
	    	  
	      }
	      System.out.println();
		 System.out.println("=============================================================");
	
 
		  //read data from single column
		 
		 
		 for(int i=2;i<=7;i++)
		 {
			 WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]"));
			 System.out.println(data.getText());
			 
		 }
		 System.out.println();
		  
	}

	
}