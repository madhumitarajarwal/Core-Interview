package com.rays.javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderOneDateJan {
	public static void main(String[] args) throws Exception {
		
		 SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		   Calendar c = Calendar.getInstance();
		  
		   String random="01/01/2025";
		   Date date=sdf.parse(random);
		   c.setTime(date);
		   for(int i=1; i<=30;i++) {
			   c.add(Calendar.DATE, 1);
			   System.out.println(c.getTime());
			 
			  
			   
		   }
	}

}
