package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotNull
{
  @Test
  public void f()
  {
	  String a="hi";
	  String b=null;
	  
	  //verify a is not null
	  Assert.assertNotNull(a, "A  value is null, TC is failed");
	  
	  //verify b is null
	  Assert.assertNull(b, "B value is not null, TC is Failed");
			  
  }
}
