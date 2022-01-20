package com.sgtesting.actitime.driverscript;

import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.HomePage;
import com.sgtesting.actitime.tests.Initialize;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Projects;
import com.sgtesting.actitime.tests.Tasks;
import com.sgtesting.actitime.tests.Users;

public class DriverScript {

	public static void main(String[] args) {
		//Create User Scenario
		//LaunchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialize.closeApplication();

		//Create and Modify User Scenario
		//LaunchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.modifyUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialize.closeApplication();

		// create customer scenario
		//LaunchBrowser-->navigate-->login-->createCustomer--->deleteCustomer--->logout -->closeApplication

		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialize.closeApplication();
		
		// modify customer scenario
		//LaunchBrowser-->navigate-->login-->createCustomer--->modifyCustomer--->deleteCustomer--->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Customers.deleteCustomer();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialize.closeApplication();
		
		
		//create project
		//LaunchBrowser-->navigate-->login-->createCustomer--->craeteProject--->deleteProject--->deleteCustomer--->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		 Projects.createProject();
		 Projects.deleteProject();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialize.closeApplication();
		
		//modify project
		//LaunchBrowser-->navigate-->login-->createCustomer--->craeteProject--->modifyProject--->deleteProject--->deleteCustomer--->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		 Projects.createProject();
		 Projects.modifyProject();
		 Projects.deleteProject();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialize.closeApplication();
		
		//create task
		//LaunchBrowser-->navigate-->login-->createCustomer--->craeteProject--->craeteTask-->deleteTask--->deleteProject--->deleteCustomer--->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		 Projects.createProject();
		 Tasks.createTask();
		 Tasks.deleteTask();
		 Projects.deleteProject();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialize.closeApplication();
	}
}
