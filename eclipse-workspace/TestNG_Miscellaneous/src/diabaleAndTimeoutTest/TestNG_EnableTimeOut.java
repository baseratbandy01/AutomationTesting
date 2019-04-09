package diabaleAndTimeoutTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_EnableTimeOut {
 
  @BeforeClass
  public void setUp() {
	  System.out.println("Before Class");
  }
  @Test(enabled=false)//this will tell testng that don't excute the this testcases so it will disable method and dont not run it
  public void testMethod1() {
	  System.out.println("this test is disabled");
  }
  @Test(timeOut=100)//if test case wont run on the paticular time then we may wants to fail the tets more likely in perfromenace test
  //doesn't matter if code is correct but then if it is slow then fail it
  public void testMethod2() {
	  System.out.println("this test will run");
  }
  @AfterClass
  public void cleanUp() {
	  System.out.println("After Class");
  }

}
