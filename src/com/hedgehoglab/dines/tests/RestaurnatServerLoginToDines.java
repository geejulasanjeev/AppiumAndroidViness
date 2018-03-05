package com.hedgehoglab.dines.tests;

import org.testng.annotations.Test;

import com.hedgehoglab.dines.activity.RestaurnatServer;

public class RestaurnatServerLoginToDines extends AppiumInstance {
	

	RestaurnatServer restaurant_server;
	
	@Test(description="Login as Restaurant", priority=8)
	public void loginToDines() throws InterruptedException
	{
		restaurant_server = new RestaurnatServer(driver);
		restaurant_server.restaurantServerLogin();
	}
	
	
	
	@Test(description="Login as Restaurant and generate a bill for customer i.e. generate DineCode", priority=9)
	public void generateBills() throws InterruptedException
	{
		restaurant_server = new RestaurnatServer(driver);
		restaurant_server.restaurantBills();
	}
	

}
