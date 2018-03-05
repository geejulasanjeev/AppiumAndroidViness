package com.hedgehoglab.dines.tests;

import org.testng.annotations.Test;

import com.hedgehoglab.dines.activity.CommonDinesObjects;
import com.hedgehoglab.dines.activity.Customer;



public class CustomerLoginToDines extends AppiumInstance{
	
	Customer customer;
	
	CommonDinesObjects commonDinesObjects;
	
	@Test(description="Login as customers user", priority=10)
	public void loginToDines() throws InterruptedException
	{
		
		commonDinesObjects = new CommonDinesObjects(driver);
		
		commonDinesObjects.allowDeviceToLocate();
		
		customer = new Customer(driver);
		
		customer.customerLogin();
		
	}
	
	@Test(description="Get the DinesCode from server/restaurant and input them to get the bill", priority=11)
	public void getMyBill() throws InterruptedException
	{
		customer = new Customer(driver);
		customer.getCustomerBill();
	}
	
	@Test(description="Once total bill got displayed on customer end, compelte the payment process", priority=12)
	public void completePaymentProcess() throws InterruptedException{
		//commonDinesObjects
		
		customer = new Customer(driver);
		customer.customerPay();
		System.out.println("************** Payment Successful **************");
	}

}
