package dataProviders;

import org.testng.annotations.DataProvider;

public class TestData {
	
@DataProvider(name="inputs")
public Object[][]getData(){
	return new Object[][] {
		{"bmw",3},
		{"audii",6},
		{"honda",2},
		{"kia",9},
	};
}
}
