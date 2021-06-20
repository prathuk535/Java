package com.learning.hashtabledemo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
	
			//HashTable
			//Unordered collection of objects which cannot
			//contain null objects
			//this is synchronized
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer , String> dataMap=new Hashtable();
		
		dataMap.put(101 , "Tanvi Varak");
		dataMap.put(106 , "Tanvi Gharte");
		dataMap.put(104 , "Tanvi Patil");
		dataMap.put(103 , "Tanvi Sogam");
		dataMap.put(105 , "Tanvi Ghadse");
		dataMap.put(102 , "Tanvi Choughale");
		
		System.out.println(dataMap);
		
	}

}
