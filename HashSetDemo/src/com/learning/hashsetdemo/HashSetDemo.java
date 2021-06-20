package com.learning.hashsetdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
	//set interface works on values instead of indexes
	//hence it does not allow duplicate values
	//HashSet does not sort the values by default
	//hence insertion of elements is faster
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet=new HashSet();
		
		//String will not be sorted aplhabetically
		hashSet.add("One");
		hashSet.add("Four");
		hashSet.add("Three");
		hashSet.add("Two");
		hashSet.add("Grass");
		hashSet.add("Five");
		
		Set<Integer> hashSet1=new HashSet();
		
		Integer n1=new Integer(101);
		Integer n2=new Integer(105);
		Integer n3=new Integer(103);
		Integer n4=new Integer(102);
		Integer n5=new Integer(104);
		
		hashSet1.add(n1);
		hashSet1.add(n2);
		hashSet1.add(n3);
		hashSet1.add(n4);
		hashSet1.add(n5);
		
		hashSet1.add(101);
		hashSet1.add(103);
		hashSet1.add(102);
		hashSet1.add(105);
		hashSet1.add(104);
		
		Iterator<String> iterator=hashSet.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
