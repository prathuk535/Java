package com.learning.characterclassdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//^[abc]		it must start either with a,b,c
		//[abc]$		it must end either with a,b,c
		
		Pattern pattern=Pattern.compile("com[^abc]at");
		
		Matcher matcher=pattern.matcher("compat");
		
		if(matcher.matches())
		{
			System.out.println("String matched");
		}
		else
		{
			System.out.println("String did not match");
		}
	}

}
