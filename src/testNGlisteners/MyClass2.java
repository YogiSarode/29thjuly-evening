package testNGlisteners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerpkg.Listener.class)
public class MyClass2 
{
  @Test
  public void x() 
 {
	 Reporter.log("X method is running",true);
 }
  @Test
  public void y() 
  { 
	  Assert.fail();
	  Reporter.log("Y method is running",true);
  }
  
  @Test(dependsOnMethods = "y")
  public void z() 
  {
	  Reporter.log("Z method is running",true);
  }
  
  @Test
  public void w() 
  {
	  Reporter.log("W method is running",true);
  }
}
