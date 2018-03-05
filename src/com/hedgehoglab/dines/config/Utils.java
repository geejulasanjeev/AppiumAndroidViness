package com.hedgehoglab.dines.config;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

import com.hedgehoglab.dines.activity.CommonDinesObjects;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;


public class Utils extends CommonDinesObjects{
	

	public Utils(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void allowDeviceLocationPermission(){
		
		
		 while (driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][1]")).size()>0) 

		 {  driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][1]")).click();
		 }
		}
	
	public boolean verifyForText(String verifytext, String matchtext)
	{
		boolean isElement = false;
		try
		{
			if((verifytext != null) && (verifytext.equals(matchtext) ))
			{
				isElement = true;
				return isElement;
			}
			//System.out.println("Element found ");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Element not found");
			isElement = false;
			return isElement;
		}
		return isElement;
	}
	
	protected boolean isElementPresent(By by) {
		  
		  
	    
		try {

			driver.findElement(by);

			return true;

			} catch (NoSuchElementException e) {

			return false;
			}

	}
}
