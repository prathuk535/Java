package com.learning.quantifiersdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt="Prathmesh is smart and Prathmesh is clever boy too..";
		String [] txtSplit=txt.split(" ");
		Pattern pattern=Pattern.compile("Pra.+");
		for(String str:txtSplit)
		{
			Matcher matcher=pattern.matcher(str);
			System.out.println("Pra found in word "+str+" : "+matcher.matches());
		}
	}

}
