package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3forChrome {
  private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimizeWindow();
		craeteCustomer();
		deleteCustomer();
		 logout();
		 closeApplication();
	}
	private static void launch()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
     private static void craeteCustomer()
     {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
    		oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
    		oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
    		oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("ajaykrishna");
    		oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("cicilenginer");
    		oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
    		Thread.sleep(3000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
     }
     private static void deleteCustomer()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
    		 Thread.sleep(3000);
    		 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
    		 Thread.sleep(3000);
    		 oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
    		 Thread.sleep(3000);
    		 oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
    		 Thread.sleep(3000);
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     private static void logout()
 	{
 		try
 		{
 			oBrowser.findElement(By.linkText("Logout")).click();
 			Thread.sleep(2000);
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

