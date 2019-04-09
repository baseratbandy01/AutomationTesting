package listenerpacakge;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class IT_TestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// It will excute when test method start that means @TestMethod not @before or @after class 
		System.out.println("This code should runn OnTestStart--> Test Name Is --> "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//This will run test method is success
		System.out.println("This code should runn onTestSuccess--> Test Name Is --> "+result.getName());
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//This will run test method is failed
		
		System.out.println("This code should runn onTestFailure--> Test Name Is --> "+result.getName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//if test is skipped
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		//This start before<test>  tag of xml file 
				System.out.println("This code should runn onStart--> Test Tag  Name Is --> "+context.getName());
				ITestNGMethod methods[]=context.getAllTestMethods();
				System.out.println("These methods will be executed in this test tag -->");
				for(ITestNGMethod method:methods) {
					System.out.println(method.getMethodName());
				}
				
				
	}

	@Override
	public void onFinish(ITestContext context) {
		
		//This start after<test>  tag of xml file
		System.out.println("This code should runn onFinish--> Test Tag  Name Is --> "+context.getName());
	}

	

}
