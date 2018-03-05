package com.hedgehoglab.dines.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumInstance {
//public static AppiumDriver<MobileElement> driver;
	public static AndroidDriver<MobileElement> driver;
	
	//@Parameters({"port","device"})
	@BeforeSuite
	//public void initialiseApplication(String port, String device) throws MalformedURLException{
	public void initialiseApplication() throws MalformedURLException{
		DesiredCapabilities capabilities =  new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

        capabilities.setCapability(CapabilityType.VERSION, "6.0.1");
		//capabilities.setCapability(CapabilityType.VERSION, platformVersion);
		
        capabilities.setCapability("platformName", "Android");
       // capabilities.setCapability("udid", UDID_);

        capabilities.setCapability("deviceName", "03157df30d05433b");
        //capabilities.setCapability("deviceName", device);

        capabilities.setCapability("appPackage","uk.co.dines.dinesapp");

        capabilities.setCapability("appActivity","uk.co.dines.dinesapp.ui.activity.MainActivity");

        driver =  (AndroidDriver<MobileElement>) new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        //driver =  (AndroidDriver<MobileElement>) new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:"+port+"/wd/hub"), capabilities);
        //driver = (AndroidDriver<MobileElement>) new AndroidDriver<MobileElement>(new URL("http://"+URL), capabilities);

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void closeApplication()
	{
		driver.quit();
		
	}


}
