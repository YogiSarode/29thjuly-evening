package testNGSerialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio 
{
  @Test
  public void ajioTest()  
  {
	  WebDriver driver = new ChromeDriver();
	 // driver.manage().window().maximize();
	  driver.get("https://www.ajio.com");
  }
}
