package testNGStudies;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority 
{
  @Test(dependsOnMethods = {"c"})
  public void a() 
  {
	  Reporter.log("Test case A is Running", true);
  }
  @Test(dependsOnMethods = {"a"} )
  public void b() 
  {
	  Reporter.log("Test case B is Running", true);
  }
  @Test(priority = -1,invocationCount = 3)
  public void c() 
  {
	  Reporter.log("Test case c is Running", true);
  }
}
