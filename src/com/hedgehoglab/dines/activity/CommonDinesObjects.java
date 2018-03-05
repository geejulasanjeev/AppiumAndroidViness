package com.hedgehoglab.dines.activity;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hedgehoglab.dines.config.AppiumUtils;
import com.hedgehoglab.dines.config.Utils;
import com.hedgehoglab.dines.datadriven.DinesCodeData;
import com.hedgehoglab.dines.datadriven.DinesData;
import com.hedgehoglab.dines.datadriven.Write;
import com.hedgehoglab.dines.datadriven.WriteDinesData;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CommonDinesObjects {
	
	public AppiumDriver<MobileElement> driver;
	
	public CommonDinesObjects(AppiumDriver<MobileElement> driver) {
		
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// TODO Auto-generated constructor stub
	}


	@AndroidFindBy(id="uk.co.dines.dinesapp:id/textview_title")
	private MobileElement findaspot;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]")
	private MobileElement profile;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]")
	private MobileElement explore_bills;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]")
	private MobileElement pay_control;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]")
	private MobileElement server_explore;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[1]")
	private MobileElement keypad_1;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]")
	private MobileElement keypad_2;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[3]")
	private MobileElement keypad_3;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.Button[1]")
	private MobileElement keypad_4;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.Button[2]")
	private MobileElement keypad_5;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.Button[3]")
	private MobileElement keypad_6;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.Button[1]")
	private MobileElement keypad_7;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.Button[2]")
	private MobileElement keypad_8;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.Button[3]")
	private MobileElement keypad_9;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]/android.widget.Button")
	private MobileElement keypad_0;
	
	//@AndroidFindBy(xpath="")
	//private MobileElement keypad_delete;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_onboarding_login")
	private MobileElement login;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/edit_text_fragment_login_email")
	private MobileElement email_edittext;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/edit_text_fragment_login_password")
	private MobileElement password_edittext;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_fragment_login_log_in")
	//@AndroidFindBy(className="android.widget.Button")
	private MobileElement loginButton;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_onboarding_sign_up")
	private MobileElement sign_up;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_onboarding_login")
	private MobileElement log_in;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/image_view_item_waiter")
	private List<WebElement> select_waiter;
	
	//username Password
	@AndroidFindBy(className="android.widget.EditText")
	private List<WebElement> tfl;
	
	//restaurants
	@AndroidFindBy(className="android.widget.RelativeLayout")
	private List<WebElement> rl;
	
	//search map refine
	@AndroidFindBy(className="android.widget.ImageView")
	private List<WebElement> search_map_refine;
	
	//explore pay profile
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/image_view_bottom_nav_menu_item")
	private List<WebElement> bnmi;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/textview_sort_by_button")
	private List<WebElement> textview_sort_by_button;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/textview_restaurant_overview_name")
	private List<WebElement> restaurantName;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/textview_item_search_result_text")
	private List<WebElement> restaurant_search_result;
	
	@AndroidFindBy(id="android.widget.LinearLayout")
	private List<WebElement> start_rating;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/multi_slider_filter_price_point")
	private List<WebElement> multi_slider;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/textview_layout_search_information")
	private MobileElement sorting_by_a_z;
	
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_fragment_pay_action")
	private MobileElement pay_signin;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/textview_highlighted")
	private MobileElement show_more_reviews;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/action_search")
	private MobileElement search_for;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/textview_highlighted")
	private MobileElement near_me;
	
	@AndroidFindBy(accessibility="My Location")
	private MobileElement my_location;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/textview__search_this_area")
	private MobileElement search_this_area;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Google Map\"]/android.view.View[1]")
	private MobileElement select_discount_restaurant;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/edittext_explore_search")
	private MobileElement search_near_me;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_refine_search_confirm")
	private MobileElement conform_button;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_fragment_bills_new_bill")
	private MobileElement new_Bill;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_fragment_new_bill_next")
	private MobileElement new_bill_next;
	
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/edit_text_table_food")
	private MobileElement food;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/edit_text_table_drinks")
	private MobileElement drinks;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_fragment_table_total_generate_bill")
	private MobileElement generate_Bill;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/text_view_its_all_set_up_dine_code_digit_1")
	private MobileElement digit_1;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/text_view_its_all_set_up_dine_code_digit_2")
	private MobileElement digit_2;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/text_view_its_all_set_up_dine_code_digit_3")
	private MobileElement digit_3;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/text_view_its_all_set_up_dine_code_digit_4")
	private MobileElement digit_4;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_fragment_its_all_set_up_live_bill")
	private MobileElement live_Bill;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_view_bill_close_bill")
	private MobileElement close_Bill;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/action_up")
	private MobileElement close_bill_back_arrow;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_fragment_pay_action")
	private MobileElement get_my_bill;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_pay_step_one_part_one_next")
	private MobileElement step_1_next;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/edit_text_pay_step_one_part_two_edit")
	private MobileElement step_1_edittext;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_pay_step_one_part_two_proceed")
	private MobileElement step_1_proceed;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_pay_step_two_use_reward")
	private MobileElement step_2_Use_reward;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_pay_step_three_tip_3")
	private MobileElement tip_15;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_pay_step_three_tip")
	private MobileElement step_3_tip;
	
	@AndroidFindBy(id="uk.co.dines.dinesapp:id/button_pay_step_four_pay")
	private MobileElement step_4_pay;
	
	int get_digit_1;
	
	int get_digit_2;
	int get_digit_3;
	int get_digit_4;
	//@AndroidFindBy()
	//private MobileElement 
	DinesCodeData dines_code_data =  new DinesCodeData();
	WriteDinesData write_dines_data = new WriteDinesData();
	AppiumUtils appiumUtils;

	Utils utils;
	
	public void allowDeviceToLocate()
	{
		//** Accept Device Location 
		utils = new Utils(driver);
		utils.allowDeviceLocationPermission();
	}
	
	public void loginSignUpScreen()
	{
		
		profile.click();
		try{
		Assert.assertEquals("sign up", sign_up.getText());
		Assert.assertEquals("login", log_in.getText());
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
			System.out.println("SIGNUP & LOGIN elements not found");
		}

		((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.BACK);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		//((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.BACK);
		explore_bills.click();
		//Verify Explore screen is shown
		Assert.assertEquals("find a spot", findaspot.getText());
		
	
		
	}
	
	public void loginPage()
	{
		login.click();
	}
	
	public void inputEmailPassword(String email, String password) throws InterruptedException
	{

		
		Thread.sleep(5000);
		profile.click();
		loginPage();
		tfl.get(0).sendKeys(email.replaceAll("\\s",""));
		Thread.sleep(5000);
		//tfl.get(0).sendKeys(dines_data.getSetter_Getter().getCustomer_email());
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);

		
		//tfl.get(1).sendKeys(dines_data.getSetter_Getter().getCustomer_password());
		tfl.get(1).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);

		Thread.sleep(2000);
		loginButton.click();
		
	}
	
	@SuppressWarnings("unused")
	public void chooseRestaurantFromList()
	{
		appiumUtils = new AppiumUtils(driver);
		Dimension size = driver.manage().window().getSize();
		//System.out.println("size.getHeight" + size.getHeight());
		for(int i=0; i<size.getHeight();i++)
		{
			appiumUtils.swipeBottomToTop();
			

			rl.get(0).click();
			
			break;
		}
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		//String DESTINATION_ELEMENT_TEXT= "EAT";
	//	((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(DESTINATION_ELEMENT_TEXT))");
		
		
		//String APP_SCROLLVIEW = "android.widget.RelativeLayout";
		//String DESTINATION_ELEMENT_TEXT= "EAT";
		//((AndroidDriver) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().className(APP_SCROLLVIEW)).scrollIntoView(new UiSelector().text(DESTINATION_ELEMENT_TEXT))");
		
		for(int i=0;i<10;i++)
		{
			appiumUtils.swipeBottomToTop();

		}
		System.out.println("Show More Reviews" + show_more_reviews.getText());
		Assert.assertEquals("more reviews", show_more_reviews.getText());
		System.out.println("Verified Restaurant page, SHOW MORE REVIEWS");
		((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.BACK);

		

	}
	
	public void waitForPageToLoad(){

		//Explore Page Title Verification
		
		//System.out.println("Verify,Explore Page Title"+findaspot.getText());
		Assert.assertEquals("find a spot", findaspot.getText());
		//System.out.println("Verified Explore Page");
	}
	
	public void paymentScreen(){
		
		// Click on Pay Tab 
		
		pay_control.click();
		//bnmi.get(1).click();
		//driver.findElement(By.)
		//System.out.println("Verify, Pay screen is shown correctly"+pay_signin.getText());
		Assert.assertEquals("sign in", pay_signin.getText());
		//System.out.println("Verified Pay Screen...");
		//((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.BACK);
		
	}
	

	
	public void searchScreen()
	{
		search_for.click();
		//System.out.println("Verify Search screen");
		Assert.assertEquals("near me",near_me.getText());
		//System.out.println("Verified search screen");
		near_me.click();
	}
	
	public void mapViewScreen() throws InterruptedException
	{
		search_map_refine.get(1).click();
		Thread.sleep(5000);
		//System.out.println("Verify search this area / MapView screen is shown");
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		

		Assert.assertEquals("search this area", search_this_area.getText());
		Thread.sleep(5000);
		select_discount_restaurant.click();
		Thread.sleep(5000);

		MultiTouchAction multiTouch = new MultiTouchAction(driver);
		TouchAction action0 = new TouchAction(driver).press(50, 522).moveTo(0, -445).release();
		TouchAction action1 = new TouchAction(driver).press(150, 522).moveTo(0, -445).release();
		TouchAction action2 = new TouchAction(driver).press(250, 522).moveTo(0, -445).release();
		multiTouch.add(action0).add(action1).add(action2).perform();
		Thread.sleep(5000);
		
		search_this_area.click();
		Thread.sleep(5000);
		search_map_refine.get(1).click();
		Thread.sleep(8000);
		
		
	}
	
	public void searchRestaurantScreen() throws InterruptedException
	{
		//explore.click();
		search_map_refine.get(0).click();
		Assert.assertEquals("search for a place or location…", search_near_me.getText());
		search_near_me.sendKeys("cafe");
		Thread.sleep(3000);
		restaurant_search_result.get(1).click();
		Thread.sleep(3000);

		((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(2000);
		((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(3000);
		//explore.click();
	}
	
	public void refineScreen() throws InterruptedException
	{
		appiumUtils = new AppiumUtils(driver);
		
		search_map_refine.get(2).click();
		Assert.assertEquals("confirm", conform_button.getText());
		textview_sort_by_button.get(2).click();
		
		appiumUtils.swipeBottomToTop();
		
		//start_rating.get(1).click();
		//appiumUtils.swipeBottomToTop();
		
		//Get start point of seekbar.
		int startX = multi_slider.get(0).getLocation().getX();
		//System.out.println(startX);
		//Get end point of seekbar.
		    int endX = multi_slider.get(0).getSize().getWidth();
		   // System.out.println(endX);
		    //Get vertical location of seekbar.
		    int yAxis = multi_slider.get(0).getLocation().getY();
		    //Set slidebar move to position.
		    // this number is calculated based on (offset + 3/4width)
		    int moveToXDirectionAt = 1000 + startX;
		  //  System.out.println("Moving seek bar at " + moveToXDirectionAt+" In X direction.");
		    //Moving seekbar using TouchAction class.
		    TouchAction act=new TouchAction(driver);
		    //act.longPress(startX,yAxis).moveTo(moveToXDirectionAt,yAxis).release().perform();
		    
		    conform_button.click();
		    Thread.sleep(2000);
		    Assert.assertEquals("you're searching in a chosen location, and sorting by a - z", sorting_by_a_z.getText());
		
		
	}
	
	public void generateBill() throws InterruptedException
	{
		
		
		explore_bills.click();
		
		new_Bill.click();
		Thread.sleep(5000);
		select_waiter.get(2).click();
		new_bill_next.click();
		
		food.sendKeys("25.50");
		drinks.sendKeys("35.50");
		generate_Bill.click();
		Thread.sleep(5000);
		int key_Pad_digit1 = Integer.parseInt(digit_1.getText());
		int key_Pad_digit2 = Integer.parseInt(digit_2.getText());
		
		//dines_code_data.setDigit_1(digit_1.getText());
		//dines_code_data.setDigit_2(digit_2.getText());
		dines_code_data.setDigit_1(key_Pad_digit1);
		dines_code_data.setDigit_2(key_Pad_digit2);
		Thread.sleep(3000);
		//int key_Pad_digit3 = Integer.parseInt(digit_3.getText());
		//int key_Pad_digit4 = Integer.parseInt(digit_4.getText());
		int key_Pad_digit3 = Integer.parseInt(digit_3.getText());
		int key_Pad_digit4 = Integer.parseInt(digit_4.getText());
		dines_code_data.setDigit_3(key_Pad_digit3);
		dines_code_data.setDigit_4(key_Pad_digit4);
		Thread.sleep(3000);
		get_digit_1 = dines_code_data.getDigit_1();
		get_digit_2 = dines_code_data.getDigit_2();
		get_digit_3 = dines_code_data.getDigit_3();
		get_digit_4 = dines_code_data.getDigit_4();
		System.out.println("DinesCode" + " "+ dines_code_data.getDigit_1()+" "+dines_code_data.getDigit_2()+" "+dines_code_data.getDigit_3()+" "+dines_code_data.getDigit_4());
		
		//Setting dines code data to file.
		Write write = new Write();
		write.writing(get_digit_1,get_digit_2,get_digit_3,get_digit_4);
		live_Bill.click();
		Thread.sleep(5000);
		Assert.assertEquals("close bill", close_Bill.getText());
		
		//print dines code from .txt file 
		WriteDinesData write_dines_data = new WriteDinesData();
		write_dines_data.writeCredentials();
		((AndroidDriver<MobileElement>) driver).pressKeyCode(AndroidKeyCode.HOME);
		
		try {driver.runAppInBackground(1);}catch(Exception e){}
		
		driver.resetApp();
		
		driver.launchApp();
		
	}

	
	public void getCustomerBill() throws InterruptedException
	{
		Thread.sleep(5000);
		
		pay_control.click();
		Thread.sleep(5000);
		
		Assert.assertEquals("get my bill", get_my_bill.getText());
		get_my_bill.click();

	MobileElement [] keypad = {keypad_0,keypad_1,keypad_2,keypad_3,keypad_4,keypad_5,keypad_6,keypad_7,keypad_8,keypad_9};
	
	
	//Get the dines code from dinecode.txt
	
	int write_dine_code1 = Integer.parseInt(write_dines_data.getWrite_dines_digit1());
	
	int write_dine_code2 = Integer.parseInt(write_dines_data.getWrite_dines_digit2());
	
	int write_dine_code3 = Integer.parseInt(write_dines_data.getWrite_dines_digit3());
	
	int write_dine_code4 = Integer.parseInt(write_dines_data.getWrite_dines_digit4());
	
	keypad[write_dine_code1].click();
	//System.out.println(write_dine_code1);
	Thread.sleep(3000);
	keypad[write_dine_code2].click();
	//System.out.println(write_dine_code2);
	Thread.sleep(3000);
	keypad[write_dine_code3].click();
	//System.out.println(write_dine_code3);
	Thread.sleep(3000);
	keypad[write_dine_code4].click();
	//System.out.println(write_dine_code4);
	Thread.sleep(5000);
	//appiumUtils.swipeBottomToTop();
	Assert.assertEquals("next", step_1_next.getText());
	
	}
		
	public void paymentProcess() throws InterruptedException{
		step_1_next.click();
		Assert.assertEquals("proceed", step_1_proceed.getText());
		Thread.sleep(3000);
		step_1_edittext.sendKeys("999.99");
		((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.BACK);
		step_1_proceed.click();
		Thread.sleep(2000);
		//appiumUtils.swipeBottomToTop();
		Assert.assertEquals("use reward", step_2_Use_reward.getText());
		step_2_Use_reward.click();
		Assert.assertEquals("tip!", step_3_tip.getText());
		tip_15.click();
		Thread.sleep(2000);
		step_3_tip.click();
		Thread.sleep(5000);
		Assert.assertEquals("pay", step_4_pay.getText());
		step_4_pay.click();
		
	}
}

		
