package com.learning.arraylistdemo;

import java.util.*;

public class ArrayListDemo {
	
	Integer int1,int2,int3,int4,int5;
	
	//collections expert classes as generic type hence we are passing
	//Integer class as generic class type
	List<Integer> intList;
	void createObject()
	{
		System.out.println("creating objects of type integer");
		int1=new Integer(101);
		int2=new Integer(105);
		int3=new Integer(102);
		int4=new Integer(101);
		int5=new Integer(103);
	}

	void addInList()
	{
		//Java7 onwards need to declare the generic type on right side
		//is eliminated,generic type declared on left will automatically
		//be assigned to right side
		//intList=new ArrayList<Integer>();
		//intList=new ArrayList<>();
		System.out.println("Adding objects in List");
		intList=new ArrayList();
		intList.add(int1);
		intList.add(int2);
		intList.add(int3);
		intList.add(int4);
		intList.add(int5);
		intList.add(new Integer(104));
	}
	
	void showList()
	{
		System.out.println("Displaying objects of type integer");
		//ListIterator iterator=intList.listIterator();
		//while(iterator.hasNext())
		//{
			//System.out.println(iterator.next());
		//}
		//System.out.println(intList.get(2));
		//intList.remove(3);  		//remove object based on index
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo demo=new ArrayListDemo();
		demo.createObject();
		demo.addInList();
		demo.showList();
	}

}
