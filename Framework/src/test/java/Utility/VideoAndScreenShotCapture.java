package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class VideoAndScreenShotCapture

{

	public  void CaptureScreenShot(WebDriver driver)
	{
		try 
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("/Users/niraj/eclipse-workspace/DemoFramework/Screenshots/Image"+ Math.random()+".jpg"));
		} 
		catch (IOException e) 
		{
			System.out.println("File not found check the configuration" + e.getMessage());

		}

	}
	}

	



