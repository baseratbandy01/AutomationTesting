package testNg1;

import org.testng.annotations.Test;

public class test1 {
	
	int x;
	int y;
	int sum;
	int total;
	@Test(groups= {"total","minus"})
	public void getsum() {
		x=10;
		y=20;
		sum=x+y;
		System.out.println(sum);
		
		
	}
	@Test(groups= {"minus"})
	public void takeaway() {
		x=10;
		y=20;
		total=y-x;
		System.out.println(total);
		
		
	}
}
