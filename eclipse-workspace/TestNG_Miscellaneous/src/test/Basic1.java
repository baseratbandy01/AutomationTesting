package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic1 {
	

      @Test(enabled=false)
		public void Firstloan() {
			System.out.println("hello");
		}
      @Parameters({"URL","APIKey/username"})
      @Test
      public void secondloaninstrulment(String urlname,String key) {
    	  System.out.println("bye");
    	  System.out.println(urlname);
    	  System.out.println(key);
    	  
      }
      @BeforeSuite
      public void bfsuite() {
    	  System.out.println("i will be Ahead");
      }
      @Test(groups= {"Smoke"})
      public void allloanpaid(){
    	  
    	  System.out.println("thank you");
      }

	}


