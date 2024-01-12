package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse 
{
  @Test
  public void trueFalse() 
  {
	  boolean a=true;
	  boolean b=false;
	  
	  //verify a is true
	  Assert.assertTrue(a,"a value is false, TC is failed");
	  
	  //verify b is false
	  Assert.assertFalse(b, "b is true, TC is Failed ");
	  
  }
}
