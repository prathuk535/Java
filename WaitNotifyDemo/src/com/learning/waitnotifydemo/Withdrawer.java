package com.learning.waitnotifydemo;

public class Withdrawer implements Runnable {
	
	Account accHolder;
	
	//constructor is receiving
	//object of Account class as parameter
	public Withdrawer(Account account)	//Aniket object will be receiving as param
	{
		accHolder=account;
	}
	@Override
	public void run()
	{
		//accessing withdraw mehod from Account class
		//through object we have received in constructor
		accHolder.withdraw(15000);
	}
}
