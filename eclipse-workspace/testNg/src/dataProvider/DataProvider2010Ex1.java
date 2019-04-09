package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2010Ex1 {
	@Test(dataProvider="test1")
	public void TestDataProvider(String st1,String st2,String st3) {
		//st1.
		
		System.out.println(st1);
	}
	
	
	@DataProvider(name = "test1")
	public Object[][] createdata1(){
		 Object[][] obj =new  Object[2][3];
		 obj[0][0]="aamina";
		 obj[0][1]="aafiya";
		 obj[0][2]="aliya";
		 
		 obj[1][0]="irfan";
		 obj[1][1]="basirat";
		 obj[1][2]="faiz";
		return obj;
		
	}
}
