package ListenersTestMethod;

import org.testng.annotations.Test;

//import listenerpacakge.IInvokedMethod_Test;
//import listenerpacakge.IT_TestListener;

import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
import org.testng.annotations.AfterClass;

//@Listeners(IT_TestListener.class)
public class Listener_Test_Method {
 
  @BeforeClass
  public void setUp() {
	  System.out.println("Code will run before class");
  }
  @Test
  public void add() {
	  int a=89;
	  int b=79;
	  int sum=a+b;
			  System.out.println("sum of two numbers are: "+sum);
  }
  
  @Test
  public void div() {
	  int a=0;
	  int b=79;
	  int division=b/a;
			  System.out.println("Times  of two numbers are: "+division);
  }
  @AfterClass
  public void cleanUp() {
	  System.out.println("Code will run after class");
  }

}
