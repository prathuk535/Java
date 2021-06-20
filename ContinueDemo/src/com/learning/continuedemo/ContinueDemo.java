package com.learning.continuedemo;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=0,i;
		
		for(i=1;i<10;i++)
		{
			if(i%3==0)
			{
				//if condition is satisfied then
				//loop will skip subsequent steps and will return back
				//to the beginning of the loop
				continue;
			}
			num++;
		}
		System.out.println("num: "+num);
	}

}
