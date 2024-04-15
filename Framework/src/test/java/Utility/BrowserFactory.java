package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory

{

	@BeforeClass
	public static WebDriver startApplication(WebDriver driver, String browserName , String Url)
	{

		if
		(browserName.equalsIgnoreCase("Chrome"))

		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if 
		(browserName.equalsIgnoreCase("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		else 
		{
			System.out.println("We do not support any browser as of now");
		}


		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		return driver;

	}

	@AfterClass
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();

	}


}
