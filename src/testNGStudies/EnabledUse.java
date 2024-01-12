package testNGStudies;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse 
{
  @Test (priority = 1)
  public void a()
  {
	  Reporter.log("a is running", true);
  }
 
  @Test(enabled = false)
  public void b()
  {
	  Reporter.log("b is running", true);
  }
  @Test(priority = -1)
  public void c()
  {
	  Reporter.log("c is running", true);
  }
  
  @Test
  public void d()
  {
	  Reporter.log("d is running", true);
  }
  
}
