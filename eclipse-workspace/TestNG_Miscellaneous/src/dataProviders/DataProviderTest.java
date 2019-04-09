package dataProviders;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DataProviderTest {
	
	
  @Test(dataProvider="inputs",dataProviderClass=TestData.class)
  public void test1(String name,int age) {
	  System.out.println("The Name of the car is:"+name );
	  System.out.println( "Age of this car is :"+age);
  }
  

}
