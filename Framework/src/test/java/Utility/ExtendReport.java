package Utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


//Need to refactor


public class ExtendReport

{
	 ExtentReports reports;

	public void ReportGeneration()
	{
		reports = new ExtentReports();
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(new File("/Users/niraj/eclipse-workspace/DemoFramework/Reports/DemoReport.html"));
		reports.attachReporter(reporter);
		reports.flush();


	}
}





