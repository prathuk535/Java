package com.learning.patternmatcherfunctiondemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sample text";
		Pattern pattern=Pattern.compile(s1);
		String s2=pattern.pattern();
		System.out.println(s2);
		
		//Split Function
		
		Pattern pattern1=Pattern.compile(":");
		//pattern1 object will search for ':' in the string given below
		//and then separate the string into two using split function
		//based on ':'
		String[] splitArr=pattern1.split("One:Two:Three",2);
		for(String splitVal:splitArr)
		{
			System.out.println(splitVal);
		}
		
		Pattern pattern2=Pattern.compile("Prathmesh");
		Matcher matcher=pattern2.matcher("Prathmesh is smart boy and Prathmesh is clever too..");
		
		StringBuffer s3=new StringBuffer();
		while(matcher.find())
		{
			matcher.appendReplacement(s3,  "Avdhoot");
			System.out.println(s3.toString());
		}
		
		Pattern  pattern3=Pattern.compile("Prathmesh");
		Matcher matcher1=pattern3.matcher("Prathmesh is samrt and Prathmesh is clever too..");
		
		StringBuffer s4=new StringBuffer();
		while(matcher1.find())
		{
			matcher1.appendReplacement(s3,"Avdhoot");
			System.out.println(s4.toString());
		}
		
		//helping us to print the whole statement
		matcher1.appendTail(s3);
		System.out.println(s3.toString());
		
		//replace functions
		Pattern pattern4=Pattern.compile("Prathmesh");
		Matcher matcher2=pattern4.matcher("Prathmeh is smart boy and Prathmesh is clever too..");
		//returns string whereas appendtail returns stringbuffer
		String s5=matcher2.replaceAll("Shubham");
		System.out.println(s5);
		
		Pattern pattern5=Pattern.compile("Prathmesh");
		Matcher matcher3=pattern5.matcher("Prathmes is smart boy and Prathmesh is clever too..");
		
		String s6=matcher3.replaceFirst("Swapnil");
		System.out.println(s6);
		
		//Position using Functions
		Pattern pattern6=Pattern.compile("Rupesh");
		Matcher matcher4=pattern6.matcher("Rahul is smart boy and Rupesh is clever too..");
		
		while(matcher4.find())
		{
			System.out.println("Match started at char position: "+matcher4.start());
		}
		
		//Position using Function
		Pattern pattern7=Pattern.compile("rahul");
		Matcher matcher5=pattern7.matcher("Swapnil is smart boy and Rupesh is clever too..");
		
		while(matcher5.find())
		{
			System.out.println("Matcher ended at char position: "+matcher.end());
		}
	}

}