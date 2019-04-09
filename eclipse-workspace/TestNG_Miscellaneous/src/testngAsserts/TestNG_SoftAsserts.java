package testngAsserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import codepackage.BasicCodeClass;

public class TestNG_SoftAsserts {
	 BasicCodeClass check=new BasicCodeClass();
	 @Test
	  public void testSum() {
		 SoftAssert sa=new SoftAssert();
	int result=	  check.sumNumber(4, 8);
	System.out.println("Sum of two numbers are : " +result);
	//Assert.assertEquals(result, 19);
	//this one will fail and second aasserts will not work
	//it will not excute any commnd after if assert fails
	//for this we need soft asserts
	sa.assertEquals(result, 19);
	System.out.println("This is wrong anwser assert will fail but it will still excute this line");
	
	sa.assertEquals(result, 12);
	System.out.println("This is correct anwser");
	//upto here it will show test case passed even their is issuse if we want it to run all test and report issuse then belwo is the command
	sa.assertAll();
	//this will run complete code then it will figure it out if their is any failur if any method is fail then it will fail the test
	  		}
}
