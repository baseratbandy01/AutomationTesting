package dependencies;

import org.testng.annotations.Test;

import codepackage.BasicCodeClass;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Test_Ng_Dependentest {
	BasicCodeClass base;
	int total;
	
	 @BeforeClass
	  public void beforeClass() {
		  base=new BasicCodeClass();
	  }
  @Test(dependsOnMethods= {"checking"},alwaysRun=true)
  public void addUp() {
	  //Assert.assertEquals(total, 14);
	 
	  System.out.println("The total of numbers are:" +total);
	
  }
  @Test
  public void checking()
  {
	  total= base.sumNumber(8, 6);
	  //System.out.println(total);
	  Assert.assertEquals(total, 12);//this will fail the test but still excute other test cases which r depenOn it AS WE USED ALWAYS RUN=TRUE
	  
  } 
  @Test(dependsOnMethods= {"addUp"},alwaysRun=true)
  public void Test()
  {
	  
	  System.out.println(total);
	  
  } 
  
 

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class");
  }

}
