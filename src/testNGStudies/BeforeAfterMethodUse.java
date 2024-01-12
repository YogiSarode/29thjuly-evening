package testNGStudies;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BeforeAfterMethodUse
{
  @Test
  public void firstMethod()
  {
	  Reporter.log("FirstMethod is Running", true);
  }
  
  @Test
  public void secondMethod()
  {

	  Reporter.log("SecondMethod is Running", true);
  
  }

  @BeforeMethod
  public void login() 
  {

	  Reporter.log("Login is done", true);
  
  }

  @AfterMethod
  public void logOut() 
  {

	  Reporter.log("logOut is done", true);
  
  }

}
