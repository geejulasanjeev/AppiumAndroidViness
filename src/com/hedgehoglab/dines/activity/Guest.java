package com.hedgehoglab.dines.activity;


import com.hedgehoglab.dines.datadriven.DinesData;
import com.hedgehoglab.dines.utils.GuestUser;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class Guest extends CommonDinesObjects implements GuestUser{
	

	
public Guest(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
}

	CommonDinesObjects commonDinesObjects = new CommonDinesObjects(driver);

	@Override
	public void guestExplore() {
		// TODO Auto-generated method stub
		
		commonDinesObjects.chooseRestaurantFromList();
		
	}

	@Override
	public void guestProfile() {
		// TODO Auto-generated method stub
		
		commonDinesObjects.loginSignUpScreen();
		DinesData.getCredentials();
	}

	@Override
	public void guestPay() {
		// TODO Auto-generated method stub
		
		commonDinesObjects.paymentScreen();
		
	}

	@Override
	public void guestSearch() throws InterruptedException{
		// TODO Auto-generated method stub
		
		commonDinesObjects.searchRestaurantScreen();
		
	}

	@Override
	public void guestMaps() throws InterruptedException {
		// TODO Auto-generated method stub
		commonDinesObjects.mapViewScreen();
	}

	@Override
	public void guestRefine() throws InterruptedException {
		// TODO Auto-generated method stub
		commonDinesObjects.refineScreen();
	}


	

}
