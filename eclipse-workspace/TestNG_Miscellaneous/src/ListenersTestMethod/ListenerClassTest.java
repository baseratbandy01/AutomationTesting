package ListenersTestMethod;

import org.testng.annotations.Test;

//import listenerpacakge.IInvokedMethod_Test;

import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
import org.testng.annotations.AfterClass;

//@Listeners(IInvokedMethod_Test.class)
public class ListenerClassTest {
 
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
  public void multi() {
	  int a=89;
	  int b=79;
	  int multiplcation=a*b;
			  System.out.println("Times  of two numbers are: "+multiplcation);
  }
  @AfterClass
  public void cleanUp() {
	  System.out.println("Code will run after class");
  }

}
