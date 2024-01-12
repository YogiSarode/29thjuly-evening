package testNGStudies;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class BeforeMethodUse 
{
  @Test
  public void myMethod() 
  {
	  Reporter.log("MyMethod is running", true);
  }
  
  @Test
  public void myMethod1() 
  {
	  Reporter.log("MyMethod1 is running", true);
  }

  @BeforeMethod
  public void login() 
  {
	  Reporter.log("Before Method is running", true);
  }
  
  
  

}
