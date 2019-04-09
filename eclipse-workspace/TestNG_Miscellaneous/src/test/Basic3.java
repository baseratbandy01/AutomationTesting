package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic3 {
	
	public void bfoclas() {
		System.out.println("before executing any method in the class");
	}
	@AfterSuite
	public void AFSuite() {
		System.out.println("I am no 1 but i will be at last");
	}
	@Parameters({"URL"})
	@Test
	public void WEbloginCarLoan(String urlname) {
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
	}
	
	@Test
	public void MobileLogincarLoan() {
		
		//AApium
		System.out.println("Mobile login");
	}
	@Test
	public void MobilesingnincarLoan() {
		
		//AApium
		System.out.println("Mobile signin");
	}
	@Test(dataProvider="getData")
	public void MobileupdatecarLoan(String username,String password) {
		System.out.println(username);
		System.out.println(password);
		
		//AApium
		System.out.println("Mobile Update");
	}
	//@AfterClass
	//public void afocal() {
	//	System.out.println("after executing all class");
	//}
	@Test()
	public void LoginAPIcarLoan() {
		//rest API automation
		System.out.println("APIlogin");
	}
	@Test
	public void MobilecovercarLoan() {
		
		//AApium
		System.out.println(" choice Mobile cover");
		Assert.assertTrue(false);
	}
	@DataProvider
	public Object[][] getData() {
		//1st combination - username pasword -good history=row
		//2nd username password no credit history
		//3rd fraud history
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0]= "first username";
		data[0][1]="password";
		//colomouns in athe row are values for that particular combination(row)
		data[1][0]="Second username";
		data[1][1]="second password";
		
		data[2][0]="third username";
		data[2][1]="third password";
		
		return data;
		
	}

}
