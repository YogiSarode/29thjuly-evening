package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsUse 
{
  @Test
  public void f() 
  {
	  String a="Mumbai";
	  String b="Mumbai";
	  
	  String c="Pune";
	  
	  //verify a and b are equal 
	  Assert.assertEquals(a, b,"A and B are not matching, TC is Failed ");
	  
	  
	  //verify b and c are  not equal 
	  Assert.assertNotEquals(b,c,"B and C are  matching, TC is Failed ");
	  
	  
	  
  }
}
