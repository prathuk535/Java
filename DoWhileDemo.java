//code will be executed atleast once irrespective of condition

class DoWhileDemo
{
	public static void main(String[] args)
		{
			int i=0;	//initial value
			do		//condition
				{
					System.out.println("Hello");
					i++;
				}
			while(i<10);
		}
}