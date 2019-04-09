package dependencies;

import org.testng.annotations.Test;

public class DependsOnMethodEx1 {
	@Test
	public void serverStartedOk() {
		System.out.println("sever started ok");
	}
		@Test(dependsOnMethods= {"serverStartedOk"})
		public void method1() {
			System.out.println("i am checking server");
		}
}
