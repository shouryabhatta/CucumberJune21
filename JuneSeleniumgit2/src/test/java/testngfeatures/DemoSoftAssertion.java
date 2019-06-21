package testngfeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssertion {
  @Test
  public void demo() {
	  SoftAssert sa=new SoftAssert() ;
		  System.out.println("Test 1 checking");
		  sa.assertEquals(10,20);
		  System.out.println("Checking 2nd test");
		  sa.assertEquals("hello","hi");
		  sa.assertAll();
		  
	  }
  }

