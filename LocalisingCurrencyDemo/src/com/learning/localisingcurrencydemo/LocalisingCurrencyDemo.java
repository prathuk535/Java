package com.learning.localisingcurrencydemo;

import java.text.NumberFormat;
import java.util.Locale;

public class LocalisingCurrencyDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale germanLocale=new Locale("de","DE");
		//Locale russianLocale=new Locale("re","RU");
		//Locale chineseLocale=new Locale("zh","CN");
		NumberFormat numberFormat=NumberFormat.getCurrencyInstance(germanLocale);
		String formattedCurrency=numberFormat.format(100000);
		System.out.println("Rs 100000 in german format:"+formattedCurrency);
	}

}
