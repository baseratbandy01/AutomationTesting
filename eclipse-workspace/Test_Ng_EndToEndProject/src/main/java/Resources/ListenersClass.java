package Resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener {
	ExecutingClass execute=new ExecutingClass();
	CallingClass call=new CallingClass();
	public void onFinish(ITestContext arg0) {
	System.out.println("This Test is done ");
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("I am going to start testing");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		result.getName();
		try {
			call.getScreenShots(result.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("I have finishes all Test ");
		
				
		
	}

}
