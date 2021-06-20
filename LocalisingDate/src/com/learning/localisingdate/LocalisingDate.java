package com.learning.localisingdate;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalisingDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale germanLocale=new Locale("de","DE");
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.SHORT,germanLocale);
		//System.out.println(new date());
		String formattedDate=dateFormat.format(new Date());
		System.out.println("Date in current locale: "+new Date()+"\n"+"and same date in german format:"+formattedDate);
	}

}
