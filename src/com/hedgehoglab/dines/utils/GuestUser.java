package com.hedgehoglab.dines.utils;

public interface GuestUser {

	public void guestExplore();
	
	public void guestProfile();
	
	public void guestPay();
	
	public void guestSearch() throws InterruptedException;
	
	public void guestMaps() throws InterruptedException;
	
	public void guestRefine() throws InterruptedException;
	
	
}
