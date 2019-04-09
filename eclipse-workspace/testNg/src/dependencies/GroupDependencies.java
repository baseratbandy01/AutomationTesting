package dependencies;

import org.testng.annotations.Test;

public class GroupDependencies {
	@Test(groups="logincheck")
	public void loginStartedOk() {
		System.out.println(" login checking is in progress");
	}
	@Test(groups="afterlogin")
	public void EnvironmentSet() {
		System.out.println(" Login Environment is Set");
	}
		@Test(groups="password")
		public void Execrise1(){
			System.out.println("passwords should be 6 charaters");
		}
		@Test(groups="successfullylogin")
		public void Execrise(){
			System.out.println("it is successful");
		}


}
