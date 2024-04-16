package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{


	WebDriver driver;


	public LoginPage(WebDriver ldriver)
	{


		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left'])[1]") 
	private WebElement loginButton;


	@FindBy (xpath = "//input[@placeholder='Email']")
	private WebElement Email;


	@FindBy(xpath= "//input[@placeholder='Password']")
	private WebElement Password;

	@FindBy(xpath= "//div[@class='ui fluid large blue submit button']")
	private WebElement SubmitButton;

	@FindBy(xpath =  "(//div[@role='listbox'])[1]") 
	private WebElement SettingsIcon;
	
	@FindBy(xpath = "//a[9]") 
	private WebElement LogoutIcon;

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

	public void loginClick()

	{
		loginButton.click();

	}

	public void LoginDetails(String email ,String password )

	{
		Email.sendKeys(email);
		Password.sendKeys(password);

	}


	public void SubmitButtonClick()

	{
		SubmitButton.click();

	}
}
