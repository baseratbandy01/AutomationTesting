package dependencies;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OverloadingMethods {

	@Test
	public void Execrise(){
		System.out.println("successful");
	}
	@Parameters("bus")
	@Test
	public void Execrise(String str){
		System.out.println(str);
		System.out.println("it is successful");
	}
	@Parameters("num")
	@Test
	public void Execrise(int x){
		System.out.println(x);
		System.out.println("it is number");
	}
	
	@Test(dependsOnMethods="Execrise")
	public void overloaddingtest() {
		System.out.println("checking overloadding");
	}
}
