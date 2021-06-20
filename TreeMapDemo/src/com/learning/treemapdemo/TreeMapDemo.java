package com.learning.treemapdemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	//Map Interface
	//which is not part of collections
	//Tt belongs to java.util package
	//Map works on Key-value pair
	//Treemap does not allow null values as keys but allows n numberof null values as values
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer , String> dataMap=new TreeMap();
		dataMap.put(101, "Tanvi Varak");
		dataMap.put(106, "Tanvi Gharte");
		dataMap.put(104, "Tanvi Patil");
		dataMap.put(103, null);
		dataMap.put(105, "Sankalp");
		dataMap.put(102, null);
		
		System.out.println(dataMap);
		System.out.println();
		
		//entrySet method returns Set interface which is enabling the
		//dataMap which is of type map to be viewed as Collection(Collection-View)
		//it will sort the data implicity and allow us to view datmap as Set Interface
		System.out.println(dataMap.entrySet());
		System.out.println();
		
		for(Map.Entry<Integer , String> data:dataMap.entrySet())
		{
			System.out.println(data.getKey()+" "+data.getValue());
		}
		
		//fetching keys of datMap and assigning them to object of Set interface
		//and hance it will not allow duplicate values
		Set<Integer> keySet=dataMap.keySet();
		
		Iterator keyIterator=keySet.iterator();
		while(keyIterator.hasNext())
		{
			System.out.println(keyIterator.next());
		}
		
		//iterating through keySet using foreach loop
		for(int k:keySet)
		{
			//MapObj.get(key)=>returns data mapped with given key
			System.out.println(k+" "+dataMap.get(k));
		}
	}

	}
