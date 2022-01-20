package com.sgtesting.xpath;

public class AutoItScript {

	public static void main(String[] args) {
		
		executeAutoIt();
	}
	private static void executeAutoIt()
	{
		try
		{
			//Runtime.getRuntime().exec("D:\\ExampleAutomation\\Automation\\AutoIT\\Example.exe");
			Runtime runtime=Runtime.getRuntime();
			runtime.exec("D:\\ExampleAutomation\\Automation\\AutoIT\\lion.exe");
			
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}

}
