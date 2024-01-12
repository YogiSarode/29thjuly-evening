package testNGSerialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBook {
  @Test
  public void facbookTest() 
  {
	  
		  WebDriver driver = new ChromeDriver();
		 // driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
	  }
  }

