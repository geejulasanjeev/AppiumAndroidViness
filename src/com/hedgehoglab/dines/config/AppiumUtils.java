package com.hedgehoglab.dines.config;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import com.hedgehoglab.dines.activity.CommonDinesObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidKeyCode;


//http://executeautomation.com/blog/locating-elements-in-appium-part-a/#more-1491
public class AppiumUtils extends CommonDinesObjects{
	

	public AppiumUtils(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//AndroidDriver<MobileElement> driver;

	Logger logger = Logger.getLogger(AppiumUtils.class);
	
	Dimension size;
	
	WebDriverWait wait;

	public void waitForPageToLoad(WebElement id){
		
		wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(id));
	}
	
	public void waitForPageToLoadAndpresenceOfElementLocated(By id)
	{
		wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By
		         //   .xpath("//android.widget.TextView[contains(@resource-id, 'action_bar_title')]")));
		wait.until(ExpectedConditions.presenceOfElementLocated(id));
	}
	
	//Wait for Spin to Disappear
	public void waitForElementToDisappear(String id){
		
		wait = new WebDriverWait(driver, 15);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
	}
	
	public WebElement waitForElement(WebElement arg){
		
		waitForPageToLoad(arg);
		
		WebElement el = arg;
		
		return el;
	}
	
	@SuppressWarnings("deprecation")
	public void swipeRight(){
		
	size = driver.manage().window().getSize();
		
		int startx = (int) (size.width * 0.9);
		int endx = (int) (size.width * 0.20);
		int starty = size.height /2;
		driver.swipe(startx, starty, endx, starty, 5000);
		
	}
	
	@SuppressWarnings("deprecation")
	public void swipeLeft(){
		
		size = driver.manage().window().getSize();
		
		int startx = (int) (size.width * 0.8);
		int endx = (int) (size.width * 0.20);
		int starty = size.height / 2;
		driver.swipe(startx, starty, endx, starty, 1000);
	
	}
	
	public boolean isElementPresent(By by){
		try{
			driver.findElement(by);
			return true;
		}
		catch(NoSuchElementException e){
			return false;
		}
	}
	
	public void swipeRightUntilLogOutSreen(String id){
		
		do{
			swipeRight();
		}
		while(!isElementPresent(By.id(id)));
	}
	
    public void swipeLeftUntilTextExists(String expected) {
        do {
        	
            swipeLeft();
            
        } while (!driver.getPageSource().contains(expected));
    }
	
    public void scrollDirection(MobileElement Id, SwipeElementDirection arg) {
        
    	MobileElement e = Id;
    	
        e.swipe(arg, 1000);
    }
    
    public void setContext(String context) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> contextNames = driver.getContextHandles();
        for (String contextName : contextNames) {
            //System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
        }
        driver.context((String) contextNames.toArray()[1]); // set context to WEBVIEW_1

        logger.info("Current context" + driver.getContext());
    }

    public void clickBackButton() {
    	
        //driver.navigate().back(); //Closes keyboard
        //driver.navigate().back(); //Comes out of edit mode
    	((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.BACK);
    }
    
    
    public String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
    
    public void scrollToTheElement(List<WebElement> iv)
    {
    	size = driver.manage().window().getSize();
    	Double screenHeightStart = size.getHeight() * 0.5;
    	int scrollStart = screenHeightStart.intValue();
    	
    	Double screenHeightEnd = size.getHeight() * 0.2;
    	int scrollEnd = screenHeightEnd.intValue();
    	for (int i = 0; i < size.getHeight(); i++) {
    		driver.swipe(0,scrollStart,0,scrollEnd,2000);
    		//if (driver.findElement(By.name("EAT")).size()>0) 
    		//exit;
    		}
    		driver.findElement(By.name("YourText")).click();
    }
    

    public void scrollToTheElement1()
    {
    	//String  name =driver.findElementByName("");
    	//WebElement abc = driver.findElement(MobileBy.AccessibilityId(locator));
    	//driver.findElementByName("EAT");
    	//WebElement abc = driver.findElement(MobileBy.AccessibilityId(("EAT")));
    	WebElement abc = driver.findElement(MobileBy.name("EAT"));
    	int x = abc.getLocation().getX();
    	int y = abc.getLocation().getY();

    	TouchAction action = new TouchAction(driver);
    	action.press(x,y).moveTo(x+90,y).release().perform();
    }

    
    public void pinchzoom() throws InterruptedException{
    	
    	WebElement e = driver.findElement(By.className(""));
    	driver.pinch(e);
    	Thread.sleep(2000);
    	driver.zoom(e);
    }
    
    public void pinchZoom() throws InterruptedException{
    	WebElement ele_image = driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");


        int x1= ele_image.getLocation().getX();
        int y1= ele_image.getLocation().getY();

        //System.out.println("x is "+x1+"y1 is "+y1);

        int x=ele_image.getLocation().getX()+ele_image.getSize().getWidth()/2;
        int y= ele_image.getLocation().getY()+ele_image.getSize().getHeight()/2;

        //Zoom
        TouchAction finger1= new TouchAction(driver);
        finger1.press(ele_image, x, y-20).moveTo(ele_image, x, y-200);

        TouchAction finger2= new TouchAction(driver);
        finger2.press(ele_image, x, y+20).moveTo(ele_image, x, y+200);

        MultiTouchAction action= new MultiTouchAction(driver);
        action.add(finger1).add(finger2).perform();

        Thread.sleep(8000);

        //Pinch
        TouchAction finger3= new TouchAction(driver);
        finger3.press(ele_image, x, y-200).moveTo(ele_image, x, y-20);

        TouchAction finger4= new TouchAction(driver);
        finger4.press(ele_image, x, y+200).moveTo(ele_image, x, y+20);

        MultiTouchAction action2= new MultiTouchAction(driver);
        action2.add(finger3).add(finger4).perform();

    }
    
    @SuppressWarnings("deprecation")
	public void swipeBottomToTop()
    {
		size = driver.manage().window().getSize();
		  //System.out.println(size);

		  //Find swipe start and end point from screen's with and height.
		  //Find starty point which is at bottom side of screen.
		  int starty = (int) (size.height * 0.80);
		  //Find endy point which is at top side of screen.
		  int endy = (int) (size.height * 0.20);
		  //Find horizontal point where you wants to swipe. It is in middle of screen width.
		  int startx = size.width / 2;
		  //System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

		  //Swipe from Bottom to Top.
	
		  driver.swipe(startx, starty, startx, endy, 3000);
    }
    
    @SuppressWarnings("deprecation")
	public void swipeTopToBottom()
    {
		size = driver.manage().window().getSize();
		  //System.out.println(size);

		  //Find swipe start and end point from screen's with and height.
		  //Find starty point which is at bottom side of screen.
		  int starty = (int) (size.height * 0.80);
		  //Find endy point which is at top side of screen.
		  int endy = (int) (size.height * 0.20);
		  //Find horizontal point where you wants to swipe. It is in middle of screen width.
		  int startx = size.width / 2;
		 // System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

		  //Swipe from Top to Bottom.
		  driver.swipe(startx, endy, startx, starty, 3000);

    }
    
   
}
