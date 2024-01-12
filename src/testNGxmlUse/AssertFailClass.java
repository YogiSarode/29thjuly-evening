package testNGxmlUse;


import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.Assert;



public class AssertFailClass 
{
  @Test
  public void f() 
  {
	  Assert.fail();
	  Reporter.log("F Mrthod is running", true);
  }
  
  @Test
  public void g() 
  {
	 // Assert.fail();
	  Reporter.log("G Mrthod is running", true);
  }
  
  @Test
  public void h() 
  {
	  Reporter.log("H Mrthod is running", true);
  }
  
}
