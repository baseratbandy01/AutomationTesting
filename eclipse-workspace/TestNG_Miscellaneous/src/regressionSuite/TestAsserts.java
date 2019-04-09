package regressionSuite;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import codepackage.BasicCodeClass;

public class TestAsserts {
	BasicCodeClass check = new BasicCodeClass();
	int result;

	@BeforeClass
	public void beforeClass() {
		result = check.sumNumber(4, 8);
	}
	@AfterClass
	public void afterClass() {
		System.out.println("this will run after class");
	}

	@Test
	public void testSum() {

		System.out.println("Sum of two numbers are : " + result);
		Assert.assertEquals(result, 12);
	}

	@Test
	public void testString() {
		String newString = check.addStrings("Hello", "World");
		String expectedString = "Hello World";
		System.out.println("String without space : " + newString);
		Assert.assertEquals(newString, expectedString);

	}

	@Test
	public void testAarraya() {
		int[] expectedAarray = { 1, 2, 3, 4, };
		int[] result = check.getArray();
		System.out.println(result);
		Assert.assertEquals(result, expectedAarray);

	}
}
