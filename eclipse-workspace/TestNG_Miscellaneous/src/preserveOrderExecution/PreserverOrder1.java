package preserveOrderExecution;

import org.testng.annotations.Test;

public class PreserverOrder1 {
  @Test
  public void add() {
	  int a=10;
	  int b=20;
	  int total=a+b;
	  System.out.println("This is total of two numbers: "+total);
  }
  @Test
  public void sub() {
	  int a=40;
	  int b=20;
	  int result=a-b;
	  System.out.println("This is subtraction of two numbers: "+result);
  }
}
