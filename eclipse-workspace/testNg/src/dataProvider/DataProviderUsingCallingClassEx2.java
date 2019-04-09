package dataProvider;

import org.testng.annotations.Test;

public class DataProviderUsingCallingClassEx2 {
	@Test(dataProvider="test1", dataProviderClass = DataProviderHoldingDataEx2.class)
	public void TestDataProvider(String st1,String st2,String st3) {
			
		System.out.println(st1);
	}
	
	
}

