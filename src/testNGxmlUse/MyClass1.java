package testNGxmlUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass1 
{
  @Test
  public void TC1() 
  {
	  Reporter.log("TC1 is Running", true); 
  }
  @Test
  public void TC2() 
  {
	  Reporter.log("TC2 is Running", true);
  }
  @Test
  public void TC3() 
  {
	  Reporter.log("TC3 is Running", true);
  }
  @Test
  public void TC4() 
  {
	  Reporter.log("TC4 is Running", true);
  }
  
}
