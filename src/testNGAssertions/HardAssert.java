package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
  @Test
  public void f() 
  {
	  String a="Yogi";
	  String b="Sarode";
	  
	  //Assert.assertEquals(a, b," A and B are Not Equal,TC is Failed");
	  Assert.assertNotEquals(a, b,"A and B are Equal, TC is Failed");
  }
  @Test
  public void m()
  {
	  String a="abc";
	  Assert.assertNull(a, "Value of a is not null");
  }
}
