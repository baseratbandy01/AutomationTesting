package testNg1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test3 {
	@Parameters("firstName ")
	@Test
	public void testSingleString(String firstName) {
	  System.out.println(firstName);
	 
	}


}
