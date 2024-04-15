package Pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utility.BrowserFactory;
import Utility.ConfigurationProperties;
import Utility.ExcelDataProvider;
import Utility.VideoAndScreenShotCapture;

public class BaseClass 
{
	public WebDriver driver;
	public ExcelDataProvider excelsheet;
	public ConfigurationProperties config;
	public VideoAndScreenShotCapture screenshot;
	public ExtentReports reports ;
	public ExtentTest logger;

	
	
	
	
	@AfterMethod
		public void SceenshotCondition(ITestResult result) 
		{
		screenshot = new VideoAndScreenShotCapture();
		
			if (result.getStatus() == ITestResult.SUCCESS);
			{
				screenshot.CaptureScreenShot(driver);
			}
			
			reports.flush();
		}
	

	@BeforeClass
	public void IntialSetup() 
	{
		driver = BrowserFactory.startApplication(driver, config.GenricData("Browser"),config.GenricData("DemoURl") );
		
		
	}
	
	@BeforeSuite
	public void ExcelDetails()
	{
	excelsheet = new ExcelDataProvider();
	
	
	reports = new ExtentReports();
	ExtentHtmlReporter reporter=new ExtentHtmlReporter(new File("/Users/niraj/eclipse-workspace/DemoFramework/Reports/DemoReport.html"));
	reports.attachReporter(reporter);
	}
	
	@BeforeSuite
	public void Configuration()
	{
		config = new ConfigurationProperties(); 
		
	}
		
	
	@AfterClass
	public void TearDown() 
	{
		BrowserFactory.quitBrowser(driver);

	}
	
	
	
}
