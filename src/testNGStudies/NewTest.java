package testNGStudies;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest 
{
  @Test
  public void f() 
  {
	  System.out.println("Hi This is Printing Statement");
	  Reporter.log("Hi this printing statement without boolean");
	  Reporter.log("Hi this is printing statement with boolean statement",true);
	  
  }
}
