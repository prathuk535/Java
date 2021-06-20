package com.learning.localisingtimedemo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalisingTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Locale russianLocale=new Locale("ru","RU");
		Locale chineseLocale=new Locale("zh","CN");
		//Locale germanLocale=new Locale("de","DE");
		DateFormat timeFormat=DateFormat.getTimeInstance(DateFormat.LONG,chineseLocale);
		//System.out.println(new date());
		String formattedTime=timeFormat.format(new Date());
		System.out.println("Date in current locale: "+new Date()+"\n"+"and same date in chinese format:"+formattedTime);
	}

}
