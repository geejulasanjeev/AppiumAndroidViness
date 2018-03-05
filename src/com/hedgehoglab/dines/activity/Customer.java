package com.hedgehoglab.dines.activity;


import com.hedgehoglab.dines.datadriven.DinesData;
import com.hedgehoglab.dines.utils.CustomersLogin;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class Customer extends CommonDinesObjects implements CustomersLogin{
	
	
	
	public Customer(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	CommonDinesObjects commonDinesObjects = new CommonDinesObjects(driver);

	String customer_email = DinesData.customer_email;
	 
	String customer_password = DinesData.customer_password;
	
	@Override
	public void customerLogin() throws InterruptedException {
		// TODO Auto-generated method stub

		commonDinesObjects.inputEmailPassword(customer_email, customer_password);
		
		
	
	}

	@Override
	public void customerExplore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void customerProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void customerPay() throws InterruptedException {
		// TODO Auto-generated method stub
		
		commonDinesObjects.paymentProcess();
		
	}

	@Override
	public void customerSearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void customertMaps() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void customerRefine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editNewCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void myReceipts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void promp_Codes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paymentSecurity() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void customerGetBill() throws InterruptedException{
		commonDinesObjects.getCustomerBill();
	}


}
