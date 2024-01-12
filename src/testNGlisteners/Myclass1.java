package testNGlisteners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myclass1 {
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
	 @Test(dependsOnMethods ="b" )
  public void c() 
  {
	  Reporter.log("C method is running",true);
  }
	  @Test
  public void d() 
  {
	  Reporter.log("D method is running",true);
  }
}
