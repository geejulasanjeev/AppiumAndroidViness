package com.hedgehoglab.dines.datadriven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DinesData {
	
	
	public static  String customer_email;
	public static  String waiter_email;
	public static  String customer_password;
	public static  String waiter_password;
	public String server_email;
	public String server_password;

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public String getWaiter_email() {
		return waiter_email;
	}

	public void setWaiter_email(String waiter_email) {
		this.waiter_email = waiter_email;
	}

	public String getCustomer_password() {
		return customer_password;
	}

	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}

	public String getWaiter_password() {
		return waiter_password;
	}

	public void setWaiter_password(String waiter_password) {
		this.waiter_password = waiter_password;
	}

	public String getServer_email() {
		return server_email;
	}

	public void setServer_email(String server_email) {
		this.server_email = server_email;
	}

	public String getServer_password() {
		return server_password;
	}

	public void setServer_password(String server_password) {
		this.server_password = server_password;
	}

	public static void getCredentials()
	
	{
	
	
		try {

			File file = new File("assert/properties.txt");
			
			BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()));
			
			String line = null;

			try {
				
				while((line = reader.readLine() )!= null){
					
					
					String lines[] = line.split("=");
					
					if(lines[0].startsWith("customer") )
					{
						customer_email = lines[1];
						
						
						//System.out.println("Customer Email"+customer_email);
						
						
					}
					if(lines[0].startsWith("password")){
						
						customer_password=lines[1];
						
					} 
					if(lines[0].startsWith("server")){
						
						waiter_email = lines[1];
						
					
					}
					if(lines[0].startsWith("spassword")){
						
						waiter_password = lines[1];
						
					}

				
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
