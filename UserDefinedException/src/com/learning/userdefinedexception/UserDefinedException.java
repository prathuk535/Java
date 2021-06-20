package com.learning.userdefinedexception;

class DivideByZeroException extends Exception
{
	DivideByZeroException(String msg)
	{
		super(msg);
	}
}

public class UserDefinedException {

	int val1=5,val2=0;
	
	void divideNums()
	{
		try {
			if(val2==0)
			{
				throw new DivideByZeroException("Divisor cannot be zero");
			}
			else
			{
				System.out.println((val1/val2));
			}
		}
		catch(DivideByZeroException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefinedException demo=new UserDefinedException();
		demo.divideNums();
	}

}
