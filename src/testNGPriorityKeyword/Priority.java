package testNGPriorityKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority
{
  @Test(priority = 1)
  public void f()
  {
	  Reporter.log("f",true);
  }
  @Test
  public void g()
  {
	  Reporter.log("g",true);
  }
  @Test(priority = -1)
  public void h()
  {
	  Reporter.log("h",true);
  }
  
}
