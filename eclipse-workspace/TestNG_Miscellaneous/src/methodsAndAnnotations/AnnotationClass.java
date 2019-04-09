package methodsAndAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class AnnotationClass {
	@BeforeClass // this will get excuted once and then all code
	public void setUp() {
		System.out.println("\nThis runs once before class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("\nThis runs once after class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nThis runs before every methods");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nThis runs after every methods");
	}

	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test-->testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test-->testMethod2");
	}

}
