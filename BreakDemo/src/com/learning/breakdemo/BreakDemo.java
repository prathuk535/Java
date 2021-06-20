package com.learning.breakdemo;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,i;
		
		for(i=1;i<10;i++)
		{
			if(i%3==0)
			{
				//if condition is satisfied then
				//loop will break and code execution will stop
				break;
			}
			num++;
		}
		System.out.println("num: "+num);

	}

}
