package com.learning.multicatchdemo;

public class MultiCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {7,3,1,2,3};
		try {
			for(int i=0;i<7;i++)
			{
				System.out.println(arr[i]);
			}
		}
		//'|' is called as pipe
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArithmeticException: "+e);
		}
	}

}
