package com.hedgehoglab.dines.datadriven;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Write {
	
	DinesCodeData dines_code_data = new DinesCodeData();
	
	//int dines_code_digit1 = dines_code_data.getDigit_1();
	
	//int dines_code_digit1 = dines_code_data.getDigit_2();
	
	//int dines_code_digit3 = dines_code_data.getDigit_3();
	
	//int dines_code_digit4 = dines_code_data.getDigit_4();
	
	   public void writing(int dines_code_digit1, int dines_code_digit2, int dines_code_digit3, int dines_code_digit4 ) {
	        try {
	            //Whatever the file path is.
	            File statText = new File("assert/dinecode.txt");
	            
	            FileOutputStream is = new FileOutputStream(statText);
	            
	            OutputStreamWriter osw = new OutputStreamWriter(is);  
	            
	            Writer w = new BufferedWriter(osw);
	            
	            w.write(dines_code_digit1+","+dines_code_digit2+","+dines_code_digit3+","+dines_code_digit4);
	            //System.out.println("Writing to the file" + dines_code_digit1+","+dines_code_digit2+","+dines_code_digit3+","+dines_code_digit4);
	            w.close();
	        } catch (IOException e) {
	        	
	            System.err.println("Problem writing to the file dinecode.txt");
	        }
	    }


}
