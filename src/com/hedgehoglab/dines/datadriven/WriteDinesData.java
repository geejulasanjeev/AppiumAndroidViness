package com.hedgehoglab.dines.datadriven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WriteDinesData {
	
	public static String write_dines_digit1;
	
	public static String write_dines_digit2;
	
	public static String write_dines_digit3;
	
	public static String write_dines_digit4;

	public String getWrite_dines_digit1() {
		return write_dines_digit1;
	}

	public void setWrite_dines_digit1(String write_dines_digit1) {
		this.write_dines_digit1 = write_dines_digit1;
	}

	public String getWrite_dines_digit2() {
		return write_dines_digit2;
	}

	public void setWrite_dines_digit2(String write_dines_digit2) {
		this.write_dines_digit2 = write_dines_digit2;
	}

	public String getWrite_dines_digit3() {
		return write_dines_digit3;
	}

	public void setWrite_dines_digit3(String write_dines_digit3) {
		this.write_dines_digit3 = write_dines_digit3;
	}

	public String getWrite_dines_digit4() {
		return write_dines_digit4;
	}

	public void setWrite_dines_digit4(String write_dines_digit4) {
		this.write_dines_digit4 = write_dines_digit4;
	}
	
	public void writeCredentials(){
		
		
		try {

			File file = new File("assert/dinecode.txt");
			
			BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()));
			
			String line = null;

			try {
				
				while((line = reader.readLine() )!= null){
					
					
					String lines[] = line.split(",");
					//for(String a : lines){
						//System.out.println("Write Dine Code" + a);
					//}
				//System.out.println("Write Dine Code Code"+lines[0]+",," + lines[1]+",,"+lines[2]+",,"+lines[3]);
				
				write_dines_digit1 = lines[0];
				
				write_dines_digit2 = lines[1];
				
				write_dines_digit3 = lines[2];
				
				write_dines_digit4 = lines[3];
				
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
