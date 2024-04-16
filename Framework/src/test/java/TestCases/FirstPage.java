package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BaseClass;
import Pages.LoginPage;


@Test
public class FirstPage extends BaseClass{

	LoginPage l;
	HomePage hp ;



	//As these methods are used for generic purpose of this class hence such cases are set to disabled  
	@Test(enabled = false)
	public void LoginCredentials()
	{
		l.LoginDetails(excelsheet.ReadStringData("Login", 0, 0),excelsheet.ReadStringData("Login", 0, 1));
		l.SubmitButtonClick();


	}

	//As these methods are used for generic purpose of this class hence such cases are set to disabled

	@Test(enabled = false)
	private void FactorySetup() 
	{
		//l =  PageFactory.initElements(driver, LoginPage.class);
		l = new LoginPage(driver);
		hp = new HomePage(driver);
	}

	@Test(priority = 1)
	public void LoginPage() throws InterruptedException 

	{
		
		logger = reports.createTest("Test Case 1 ");
		
		
		FactorySetup();
		l.loginClick();
		System.out.println("login Button Press");
		Thread.sleep(5000);

		LoginCredentials();
		Thread.sleep(5000);

		System.out.println("Login Credentials Entered");
		Thread.sleep(5000);
		hp.SettingsIcon();
		System.out.println("Click on settings icon");
		Thread.sleep(5000);

		hp.LogoutIcon();
		System.out.println("Click on Logout icon");
		
		logger.pass("TestCase Pass");

		//BrowserFactory.quitBrowser(driver);
	}


	@Test(priority = 2)
	public void GoToProductPage () throws InterruptedException
	{
		logger = reports.createTest("Test Case 2 ");

		FactorySetup();
		//l.loginClick();
		LoginCredentials();
		hp.SettingsIcon();
		Thread.sleep(5000);
		hp.ProductIcon();
		Thread.sleep(5000);
		
		logger.pass("TestCase Pass");

	}

}




