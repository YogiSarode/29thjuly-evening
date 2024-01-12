package testNGStudies;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimesOutUse 
{
  @Test(timeOut = 5000)
  public void f() throws InterruptedException
  {
	  Thread.sleep(700);
	  Reporter.log("Payement done Successfully", true);
  }
}
