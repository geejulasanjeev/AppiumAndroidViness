package com.hedgehoglab.dines.tests;


import org.testng.annotations.Test;

import com.hedgehoglab.dines.activity.CommonDinesObjects;

import com.hedgehoglab.dines.activity.Guest;


public class GuestUserToDines extends AppiumInstance{
	
	CommonDinesObjects commonDinesObjects;
	
	Guest guest;

	@Test(description="Launch Dines Apps & Accept Device Location", priority=1) 
	public void testAcceptDeviceLocation() throws InterruptedException 
	{

		String activity = driver.currentActivity();
		System.out.println("************** Dines - Eat Out, Pay Less, Get Points **************");

		commonDinesObjects = new CommonDinesObjects(driver);
		commonDinesObjects.allowDeviceToLocate();
		//wait for page to load
	
		commonDinesObjects.waitForPageToLoad();
		//System.out.println("Complete Explore Page has loaded now, and we are ready to select a restaurant");
		
	}
	
	@Test(description="Find deals nearby, scroll restaurants and select one, go through the restaurant details, opening timings, reviews etc..", priority=2)
	public void testScrollRestaurants(){
		
		//Scroll to the Particular Restaurant 

		commonDinesObjects.waitForPageToLoad();
		
		guest = new Guest(driver);
		guest.guestExplore();
	}
	
	@Test(description="Tap on pay, Verify REWARD YOURSELF & SIGN IN buttons are shown", priority=3)
	public void testPay()
	{
		guest = new Guest(driver);
		guest.guestPay();
	}
	
	@Test(description="Tap on profile, Verify SIGNUP & LOGIN buttons are shown", priority=4)
	public void testProfile()
	{
		guest = new Guest(driver);
		guest.guestProfile();
	}
	
	@Test(description="Tap on maps, check deals nearby, also check highest deals percentage.", priority=5)
	public void  mapSscreen() throws InterruptedException
	{
		guest = new Guest(driver);
		guest.guestMaps();
	}
	
	@Test(description="Search a Restaurant by its Name or Place ", priority=6)
	public void searchARestaurant() throws InterruptedException
	{
		guest = new Guest(driver);
		guest.guestSearch();
	}
	
	@Test(description="Click on refine, select a refine search", priority=7)
	public void refineScreen() throws InterruptedException{
		
		guest = new Guest(driver);
		guest.refineScreen();
		
	}

}
