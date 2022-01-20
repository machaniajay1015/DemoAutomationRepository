package com.sgtesting.actitime.driverscript;

import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.HomePage;
import com.sgtesting.actitime.tests.Initialize;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Projects;
import com.sgtesting.actitime.tests.Tasks;
import com.sgtesting.actitime.tests.Users;

public class DriverScript {

	public static void main(String[] args) {
		WebDriver oBrowser=null;
		//Create User Scenario
		//LaunchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication
		oBrowser=Initialize.launchBrowser();
		Initialize.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Users.createUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialize.closeApplication(oBrowser);
		
		//Create and Modify User Scenario
		//LaunchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication
		oBrowser=Initialize.launchBrowser();
		Initialize.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Users.createUser(oBrowser);
		Users.modifyUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialize.closeApplication(oBrowser);
		// create customer scenario
				//LaunchBrowser-->navigate-->login-->createCustomer--->deleteCustomer--->logout -->closeApplication

			oBrowser=Initialize.launchBrowser();
				Initialize.navigate(oBrowser);
				LoginLogout.login(oBrowser);
				HomePage.minimizeFlyOutWindow(oBrowser);
				Customers.createCustomer(oBrowser);
				Customers.deleteCustomer(oBrowser);
				LoginLogout.logout(oBrowser);
				Initialize.closeApplication(oBrowser);
				
				// modify customer scenario
				//LaunchBrowser-->navigate-->login-->createCustomer--->modifyCustomer--->deleteCustomer--->logout -->closeApplication
				oBrowser=Initialize.launchBrowser();
				Initialize.navigate(oBrowser);
				LoginLogout.login(oBrowser);
				HomePage.minimizeFlyOutWindow(oBrowser);
				Customers.createCustomer(oBrowser);
				Customers.deleteCustomer(oBrowser);
				Customers.deleteCustomer(oBrowser);
				LoginLogout.logout(oBrowser);
				Initialize.closeApplication(oBrowser);
				
				
				//create project
				//LaunchBrowser-->navigate-->login-->createCustomer--->craeteProject--->deleteProject--->deleteCustomer--->logout -->closeApplication
				oBrowser=Initialize.launchBrowser();
				Initialize.navigate(oBrowser);
				LoginLogout.login(oBrowser);
				HomePage.minimizeFlyOutWindow(oBrowser);
				Customers.createCustomer(oBrowser);
				 Projects.createProject(oBrowser);
				 Projects.deleteProject(oBrowser);
				Customers.deleteCustomer(oBrowser);
				LoginLogout.logout(oBrowser);
				Initialize.closeApplication(oBrowser);
				
				//modify project
				//LaunchBrowser-->navigate-->login-->createCustomer--->craeteProject--->modifyProject--->deleteProject--->deleteCustomer--->logout -->closeApplication
				oBrowser=Initialize.launchBrowser();
				Initialize.navigate(oBrowser);
				LoginLogout.login(oBrowser);
				HomePage.minimizeFlyOutWindow(oBrowser);
				Customers.createCustomer(oBrowser);
				 Projects.createProject(oBrowser);
				 Projects.modifyProject(oBrowser);
				 Projects.deleteProject(oBrowser);
				Customers.deleteCustomer(oBrowser);
				LoginLogout.logout(oBrowser);
				Initialize.closeApplication(oBrowser);
				
				//create task
				//LaunchBrowser-->navigate-->login-->createCustomer--->craeteProject--->craeteTask-->deleteTask--->deleteProject--->deleteCustomer--->logout -->closeApplication
				oBrowser=Initialize.launchBrowser();
				Initialize.navigate(oBrowser);
				LoginLogout.login(oBrowser);
				HomePage.minimizeFlyOutWindow(oBrowser);
				Customers.createCustomer(oBrowser);
				 Projects.createProject(oBrowser);
				 Tasks.createTask(oBrowser);
				 Tasks.deleteTask(oBrowser);
				 Projects.deleteProject(oBrowser);
				Customers.deleteCustomer(oBrowser);
				LoginLogout.logout(oBrowser);
				Initialize.closeApplication(oBrowser);
	}

}
