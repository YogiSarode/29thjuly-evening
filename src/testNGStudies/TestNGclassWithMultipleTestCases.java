package testNGStudies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGclassWithMultipleTestCases
{
	WebDriver driver= new ChromeDriver();
  @Test
  public void fbLaunch() 
  {
	  driver.get("https://www.facebook.com");
	  Reporter.log("Facebook Launching", true);
  }
  @Test
  public void naukariLaunch() 
  {
	  driver.get("https://www.naukri.com");
	  Reporter.log("Naukari.com Launching", true);

  }
  @Test
  public void instaLaunch() 
  {
	  driver.get("https://www.instagram.com");
	  Reporter.log("Instagram Launching", true);

  }
}
