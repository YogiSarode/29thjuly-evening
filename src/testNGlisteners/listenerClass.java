package testNGlisteners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerpkg.Listener.class)
public class listenerClass {
  @Test
  public void a() 
  {
	  Reporter.log("A method is running",true);
  }
  @Test
  public void b() 
  {
	  Assert.fail();
	  Reporter.log("B method is running",true);
  }
  @Test(dependsOnMethods = {"b"})
  public void c() 
  {
	  Reporter.log("c method is running",true);
  }
  @Test
  public void d() 
  {
	  Reporter.log("d method is running",true);
  }
  
}
