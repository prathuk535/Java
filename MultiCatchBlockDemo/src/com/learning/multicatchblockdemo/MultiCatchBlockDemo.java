package com.learning.multicatchblockdemo;

public class MultiCatchBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {7,3,1,4};
		try {
			for(int i=0;i<7;i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException: "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException: "+e);
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}
		//we can have finally block directly without catch block
		finally
		{
			System.out.println("End of program");
		}
	}
}
	

	
