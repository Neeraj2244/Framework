package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.SettingsSection;


@Test
public class HomePage {

	WebDriver driver;
	SettingsSection ss ;


	private void FactorySetting() 
	{
		ss = new SettingsSection(driver);
	}

	public HomePage(WebDriver driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void SettingsIcon() throws InterruptedException 

	{
		System.out.println("Inside HomePage, settingicon method");
		FactorySetting();
		ss.ClickOnSettingsIcon();
	}
	
	@Test
	public void LogoutIcon() throws InterruptedException 

	{
		System.out.println("Inside HomePage, logouticon method");
		ss.ClickOnLogoutIcon();
	}

	@Test
	public void ProductIcon() throws InterruptedException 

	{
		System.out.println("Inside HomePage, Producticon method");
		ss.ClickOnProductIcon();
	}
	
	
}
