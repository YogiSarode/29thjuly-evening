package testNGStudies;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 {
 @Test(enabled = false )
  public void x()
  { 
	 Reporter.log("x", true);
  }
  
 @Test(priority = 5)
 public void y()
 { 
	 Reporter.log("y", true);
 }
 @Test(priority = -1)
 public void z()
 { 
	 Reporter.log("z", true);
 }


}
