package com.learning.hashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	//Map Interface
	//which is not part of collection
	//It belongs to java.util.package
	//Map works on key-Value pair
	//HaspMap allows only one null value as key and n number of null values as values
	//if we provide more than one null keys then older value will be overwritten
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer , String> dataMap=new HashMap();
		dataMap.put(101 , "Tanvi Varak");
		dataMap.put(106 , "Tanvi Gharte");
		dataMap.put(104 , "Tanvi Patil");
		dataMap.put(103 , null);
		dataMap.put(null , "Swapnil");
		dataMap.put(102 , null);
		dataMap.put(null , "Rupesh Dhuri");
		
		//System.out.println("DataMap: "+dataMap);
		//System.out.println();
		
		//entrySet method returns Set interface which is enabling the
		//dataMap which is type Map to be viewed as Collection(Collection-View)
		//it will sort the data implicitly and allows us to view dataMap as Set Interface
		//System.out.println("Entryset: "+dataMap.entrySet());
		//System.out.println();
		//Iterating through each entry is entrySet of dataMap
		for(Map.Entry<Integer , String> data:dataMap.entrySet())
		{
			System.out.println(data.getKey()+" "+data.getValue());
		}
		
		//System.out.println(dataMap);
		//System.out.println();
	}

}
