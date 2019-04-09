package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Basic5 {
	
	@Test
	public void demoloan() {
		 System.out.println("just checking listerner method");
	}
	@Test
	public void AFloandemo() {
		
		System.out.println("here it should fail");
		Assert.assertTrue(false);
		
	}

}
