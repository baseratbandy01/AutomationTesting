package preserveOrderExecution;

import org.testng.annotations.Test;

public class PreserveOrder2 {
  @Test(priority=0)
  public void multiply() {
	  int a=10;
	  int b=20;
	  int total=a*b;
	  System.out.println("This is multplication of two numbers: "+total);
  }
  @Test(priority=1)
  public void divide() {
	  int a=600;
	  int b=20;
	  int total=a/b;
	  System.out.println("This is division of two numbers: "+total);
  }
}
