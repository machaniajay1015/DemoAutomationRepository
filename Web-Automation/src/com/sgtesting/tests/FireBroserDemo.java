package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireBroserDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowesr();
		navigate();
		closeApplication();
	}
	private static void launchBrowesr()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe" );
			oBrowser=new FirefoxDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
