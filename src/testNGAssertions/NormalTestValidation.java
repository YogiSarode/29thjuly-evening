package testNGAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NormalTestValidation 
{
  @Test
  public void validateFBGenderCheckBox() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(2000);
	  boolean radioButtonSelectionStatus=driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	  //if female gender radio button, is selected then TC is PASSED elseTC is FAILED
	  System.out.println("Female radio button Status is "+radioButtonSelectionStatus);
	  Thread.sleep(2000);
	  
	  Assert.assertTrue(radioButtonSelectionStatus,"TC is failed, radio button is not selected");
//	  if(radioButtonSelectionStatus)
//	  {
//		  System.out.println("Radio button is selected,TC is passed");
//	  }
//	  else
//	  {
//		  System.out.println("Radio button is not selected,TC is failed");
//	  }
   }
 
}
