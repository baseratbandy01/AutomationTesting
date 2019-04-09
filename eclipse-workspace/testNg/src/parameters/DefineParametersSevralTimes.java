package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DefineParametersSevralTimes {
	
		@Parameters("number-of-times")
		  @Test
		  public void accessPage(int numberOfTimes) {
		    while (numberOfTimes-- > 0) {
		     System.out.println("this web page is used several times");
		    }
		  }
		}


