package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.ListenersDemo.class)
public class ListenerTestCases {
	int a;
	int b;
	int sum;
	int result;
	@Test(groups= {"add"}) 
	public void adding() {
		a = 20;
		b = 40;
		sum = a+b;
		System.out.println(sum);
	}
	
	@Test 
	public void div() {
		a = 20;
		b = 0;
		result = a/b;
		System.out.println(result);
	}
	@Test
	public void failThisTest() {
		System.out.println("This test will fail");
		Assert.assertTrue(true);
	}

}
