package miscUnorderedList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> searchResult = driver.findElements(By.xpath("//div[@class='dRYYxd'][1]"));
		for(WebElement sr:searchResult)
		{
			System.out.println(sr.getText());
		}
		System.out.println("==================================================");
		String expResult="honda elevate";
		for(WebElement sr1:searchResult)
		{
			String actResult=sr1.getText();
			if(actResult.equals(expResult))
			{
				sr1.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Images']")).click();
	}

}
