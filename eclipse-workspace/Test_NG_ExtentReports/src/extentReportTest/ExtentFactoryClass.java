package extentReportTest;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactoryClass {
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String path="E://Library//TestNg_ExtentReports//pageObjctReport-demo1.html";
		
		//in below path if u want to overwrite ur report u needs to give true othewise if u want 
		//to append that report then false at the same run
		//for the new run  we can give different file name
			extent =new ExtentReports(path,false);
		// belwo is method is optional if u want it add it or leave it
		extent
		.addSystemInfo("Selenium Version", "3.54")
		.addSystemInfo("Platform", "Windows 10");
		
		return extent;
	}

}
