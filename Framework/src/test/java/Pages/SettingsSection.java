package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsSection 
{


	 WebDriver driver;


	public SettingsSection(WebDriver ldriver)
	{


		this.driver = ldriver;

	}

	@FindBy(xpath =  "(//div[@role='listbox'])[1]") 
	private WebElement SettingsIcon;
	
	@FindBy(xpath = "//a[9]") 
	private WebElement LogoutIcon;
	
	
	@FindBy(xpath = "//div[@id='top-header-menu']//a[2]\n") 
	private WebElement ProductIcon;
	

	public void ClickOnSettingsIcon()

	{
		System.out.println("Inside SettingSecotionn, settingicon method");
		SettingsIcon.click();
		

	}
	
	public void ClickOnLogoutIcon()

	{
		System.out.println("Inside SettingSecotionn, logouticon method");
		LogoutIcon.click();
		
	}
	
	public void ClickOnProductIcon()

	{
		System.out.println("Inside SettingSecotionn, production icon method");
		ProductIcon.click();
		
	}

	
	
	
}
