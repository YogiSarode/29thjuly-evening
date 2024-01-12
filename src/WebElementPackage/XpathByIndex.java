package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException
	{
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.redbus.in/");
	    Thread.sleep(1000);
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Nagpur");    

	}

}
