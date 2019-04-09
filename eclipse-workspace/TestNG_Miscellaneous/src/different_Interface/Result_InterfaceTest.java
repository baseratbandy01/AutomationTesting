package different_Interface;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Result_InterfaceTest {
	int a;
	 int b;
	 int total;
  @Test
  public void add() {
	   a=30;
	   b=89;
	    total=a+b;
	    System.out.println(total);
	    
	    Assert.assertTrue(true);
  }
  @Test
  public void sub() {
	  total=a-b;
	  System.out.println(total);
	  Assert.assertTrue(false);
  }
  @AfterMethod
  public void afterMethod(ITestResult testResult) {
	  if(testResult.getStatus()==ITestResult.FAILURE) {
	  System.out.println("This testcase was failed: " +testResult.getMethod().getMethodName());
	  }
	  if(testResult.getStatus()==ITestResult.SUCCESS) {
		  System.out.println("This testcase is passed: " +testResult.getName());
		  }
  }

}
