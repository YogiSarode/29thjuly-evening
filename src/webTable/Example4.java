package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
		
		int numberOfRows=driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		System.out.println(numberOfRows);
		int numberOfColumns=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr[1]/th")).size();
		
		System.out.println("============================================================");
		//for reading header only
		for(int h=1;h<=numberOfColumns;h++)
		{
           String data = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr[1]/th["+h+"]")).getText();
           System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("============================================================");
		 
		//to read table
		for(int i=1;i<=numberOfRows-1;i++)
		{
			for(int j=1;j<=numberOfColumns;j++)
			{
				String data = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+" ");
			}
			System.out.println();
			System.out.println("============================================================");
		}
	} 

}
