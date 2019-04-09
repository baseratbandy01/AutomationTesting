package testngAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

import codepackage.BasicCodeClass;

public class TestAsserts {
	 BasicCodeClass check=new BasicCodeClass();
  @Test
  public void testSum() {
	 
int result=	  check.sumNumber(4, 8);
System.out.println("Sum of two numbers are : " +result);
Assert.assertEquals(result, 12);
  		}
  @Test
  public void testString() {
	String newString=  check.addStrings("Hello", "World");
	String expectedString="Hello World";
	  System.out.println("String without space : "+newString);
	  Assert.assertEquals(newString, expectedString);
	  
	  
  }
  @Test 
  public void testAarraya() {
	  int[] expectedAarray= {1,2,3,4,};
	 int[] result= check.getArray();
	 System.out.println(result);
	 Assert.assertEquals(result, expectedAarray);
	
  }
 	}
