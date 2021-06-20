package com.learning.isalivedemo;

public class IsAliveDemo implements Runnable {
	
	@Override
	public void run()
	{
		System.out.println("From run method");
		for(int i=0;i<5;i++)
		{
			try {
				System.out.println("From child method: "+i);
				System.out.println("Is child threat alive?"+" "+Thread.currentThread().isAlive());
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Child threat finished");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main crearing object of class");
		IsAliveDemo demo=new IsAliveDemo();
		Thread th=new Thread(demo);
		
		System.out.println("Main invoking function");
		th.start();
		//time is provided in miliseconds
		try {
			//in order to handle the error of
			//getting the thread interrupted between sleep time
			//we should surround it with try catch
			//Thread keyword refers to current thread
			System.out.println("Is child thread alive in main before main sleeps??"+th.isAlive());
			Thread.sleep(3000);
			System.out.println("Is child thread alive in main after main awakes??"+th.isAlive());
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Is child thread alive in main??"+th.isAlive());
		System.out.println("Main Finished");
	}

}
