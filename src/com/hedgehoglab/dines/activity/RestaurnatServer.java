package com.hedgehoglab.dines.activity;

import com.hedgehoglab.dines.datadriven.DinesData;
import com.hedgehoglab.dines.utils.RestaurantServerLogin;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class RestaurnatServer extends CommonDinesObjects implements RestaurantServerLogin {

	public RestaurnatServer(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	CommonDinesObjects commonDinesObjects = new CommonDinesObjects(driver);
	
	String waiter_email = DinesData.waiter_email;
	 
	String waiter_password = DinesData.waiter_password;

	@Override
	public void restaurantServerLogin() throws InterruptedException {
		// TODO Auto-generated method stub
		
		commonDinesObjects.inputEmailPassword(waiter_email, waiter_password);
	}

	@Override
	public void restaurantBills() throws InterruptedException {
		// TODO Auto-generated method stub
		
		commonDinesObjects.generateBill();
		
	}

	@Override
	public void restaurantControl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restaurantProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restaurantSearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restaurantMaps() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restaurantRefine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logoutAsRestaurantServer() {
		// TODO Auto-generated method stub
		
	}





}
