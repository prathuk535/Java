package com.learning.vectorlistdemo;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorListDemo {
	
	//The only difference between vector class and other two i.e
	//LinkedList and ArrayList is that the vector list is synchronized
	//means only one thread can access the list at a time
	//whereas LinkedList and ArrayList are not synchronized
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> vctrLst=new Vector<Double>();
		
		vctrLst.add(new Double(4.5));
		vctrLst.add(new Double(7.2));
		vctrLst.add(new Double(2.8));
		vctrLst.add(new Double(9.5));
		
		System.out.println("Elements stored in object: "+vctrLst);
		
		ListIterator<Double> iterator=vctrLst.listIterator();
		while(iterator.hasNext())
		{
			Double doubleVal=iterator.next();
			System.out.println(doubleVal);
		}
	}

}
