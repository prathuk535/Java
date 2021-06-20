package com.learning.enumdemo2;

public class EnumDemo2 {
	
	enum Colors{Red(5),Orange(6),Purple(7),Blue(8);
		
		private int colorCode;
		
		Colors(int val)
		{
			colorCode=val;
		}
		
		public int getCode()
		{
			return colorCode;
			
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colors demo=Colors.Blue;
		System.out.println(demo.getCode());
	}

}
