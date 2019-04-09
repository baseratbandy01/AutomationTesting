package dependencies;

import org.testng.annotations.Test;

public class MethodDEpendsOnGroups {
	@Test(groups="servercheck")
	public void serverStartedOk() {
		System.out.println("checking is in progress");
	}
	@Test(groups="servercheck")
	public void EnvironmentSet() {
		System.out.println("Environment is Set");
	}
		@Test(dependsOnGroups= {"server*.*"})
		public void Execrise(){
			System.out.println("successful");
		}
		@Test(dependsOnMethods="Execrise")
		public void Execrise(String str){
			System.out.println("it is successful");
		}

	}


