package testNGAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssertUse 
{
  @Test
  public void f() 
  {
	  //SoftAssert s=new SoftAssert();
	  String a="Hello";
	  String b="Hello";
	 // s.assertNotEquals(a,b," a and b both String are matching, TC is failed");
	  
	  SoftAssert s1=new SoftAssert();
	  s1.assertEquals(a,b, "a and b are not equals, TC is failed");
	 // s1.assertNull(b, "B is not null");
	  s1.assertAll();
			  
  }
  @Test
  public void m() 
  {
	  
	  String a=null;
	 
	  
	  SoftAssert s2=new SoftAssert();
	  s2.assertNull(a, "A is not null");
	  s2.assertAll();
			  
  }
  
}
