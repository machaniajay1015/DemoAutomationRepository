package com.sgetsting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6POM
{
	public static WebDriver oBrowser=null;
	public static Assignment1Actitime oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}

	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new Assignment1Actitime (oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassWord().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createCustomer()
	{
		try
		{
			oPage.getCreateCustomertoclickTask().click();
			Thread.sleep(1000);
			oPage.getCreateAddNewCustomerUnderTaskbar().click();
			Thread.sleep(1000);
			oPage.getcreateCustomertoselectNewCustomer().click();
			Thread.sleep(1000);
			oPage.getGiveCustomername().sendKeys("ajay");
			Thread.sleep(1000);
			oPage.getconfirmCreateCustomer().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{
			oPage.getclickAddNew().click();
			oPage.getclickNewprojectunderADDNew().click();
			Thread.sleep(2000);
			oPage.getGiveProjectnameonnameField().sendKeys("Internshala");
			Thread.sleep(1000);
			oPage.getconfirmCreateproject().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyProject()
	{
		try
		{
			oPage.getclickSettingstoModifyproject().click();
			Thread.sleep(2000);
			oPage.getgiveDescriptioninproject().click();
			Thread.sleep(1000);
			oPage.getgiveDescriptioninproject().sendKeys("new feature of internshala");
			Thread.sleep(1000);
			oPage.getclickSettingstoModifyproject().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject()
	{
		try
		{
			oPage.getclicksettingsatproject().click();
			Thread.sleep(1000);
			oPage.getclickActionsinProject().click();
			Thread.sleep(1000);
			oPage.getclickDeleteonProject().click();
			Thread.sleep(1000);
			oPage.getconfirmDeleteProject().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteCustomer()
	{
		try {
			oPage.getclickSettingCustomertoModifyorDelete().click();
			Thread.sleep(3000);
			oPage.getclickActionButtontoDeleteCustomer().click();
			oPage.getclickDeleteCutomer().click();
			Thread.sleep(1000);
			oPage.getClickDeleteCustomerConfirm().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}



