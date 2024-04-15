package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationProperties

{
	Properties pro;
	public ConfigurationProperties()
	{
		File file = new File("/Users/niraj/eclipse-workspace/DemoFramework/Configuation/Config.properties");
		try 
		{
			FileInputStream fs = new FileInputStream(file);
			pro = new Properties();
			pro.load(fs);
		} 
		catch (Exception e) 
		{
			System.out.println("Unable to read the Configuration Property File"+e.getMessage());

		}
	}


	public String GenricData(String PassAnyKey)
	{
		return pro.getProperty(PassAnyKey);
	}


}


