package testNGSerialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipKart {
  @Test
  public void flipKartTest() 
     {
		  WebDriver driver = new ChromeDriver();
		 // driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com");
	  }
  }

