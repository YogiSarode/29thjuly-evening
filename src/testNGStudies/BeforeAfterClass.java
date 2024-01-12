package testNGStudies;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeAfterClass
{
  @Test
  public void TC1() 
  {
	  Reporter.log("TC1 is running", true);
  }
  @Test
  public void TC2() 
  {
	  Reporter.log("TC2 is running", true);

  }
  @Test
  public void TC3() 
  {
	  Reporter.log("TC3 is running", true);

  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("BeforeMethod is running", true);

  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("AfterMethod is running", true);

  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("BeforeClass is running", true);

  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("AfterClass is running", true);

  }
  
  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("BeforTest is running", true); 
	  
  }
  
  @AfterTest
  public void afterTest()
  {
	  Reporter.log("AfterTest is running", true); 
	  
  }
  

}
