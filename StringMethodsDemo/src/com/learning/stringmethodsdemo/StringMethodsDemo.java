package com.learning.stringmethodsdemo;

public class StringMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val="Sample text";
		//System.out.println("No of characters: "+val.length());
	
		//System.out,println("val.charAt(3));
		//char[] str=new char[6];
		//val.getchars(7,11,str,0);
		//for(char v:str)
	//	{
	//		System.out.println(v+"\t)");
	//	}
		
	//	String val2="Sample";
	//	String val3="sample";
	//	if(val2.equals(val3))
	//	{
	//		System.out.println("Equals");
	//	}
	//	else
	//	{
	//		System.out.println("Not Equals");
	//	}
		
	//	String val2="Sample";
	//	String val3="sample";
	//	int result=val2.compareTo(val3);
	//	System.out.println(result);
		
	//	System.out.println(val.startsWith("Sample"));
	//	System.out.println(val.endsWith("Text"));
		
	//	System.out.println(val.indexOf('e'));
	//	System.out.println(val.lastIndexOf('e'));
		
	//	System.out.println(val.substring(7));
		
	//	System.out.println(val.concat("added"));
		
	//	System.out.println(val.replace('x','s'));
		
	//	System.out.println(val.toUpperCase());
		
	//	System.out.println(val.toLowerCase());
		
	//	String val4="	Hello	";
	//	System.out.println(val4);
	//	System.out.println(val4.trim());
		
	//	char[] valArr=val.toCharArray();
	//	for(char v:valArr)
	//	{
	//		System.out.println(v+"\t");
	//	}
		
		//to convert an variable into string we can use
		//toString() and String.valueOf() methods
		//while dealing with reference variables such as objects
		//we shall use toString
		//while dealing with primitive data type we shall
		//use String.ValueOf();
		//int num=5;
	//	System.out.println(String.valueOf(num)+7);
	
		String val2=new String("Sample Text");
		if(val.equals(val2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
	}

}
