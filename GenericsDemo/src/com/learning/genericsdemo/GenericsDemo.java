package com.learning.genericsdemo;

public class GenericsDemo<T> {
	
	T val;
	
	public GenericsDemo(T val)
	{
		this.val=val;
	}

	void showVal()
	{
		System.out.println("Value of generic variable: "+val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsDemo<Integer> demo1=new GenericsDemo(5);
		GenericsDemo<Double> demo2=new GenericsDemo(57.25);
		GenericsDemo<Character> demo3=new GenericsDemo('A');
		
		demo1.showVal();
		demo2.showVal();
		demo3.showVal();
	}

}
