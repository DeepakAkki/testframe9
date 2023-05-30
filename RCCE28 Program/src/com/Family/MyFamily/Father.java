package com.Family.MyFamily;

public class Father 
{
	public void cycle()
	{
		System.out.println("cycle public");
	}
	private void ATM()
	{
		System.out.println("ATM private");
	}
	void car()
	{
		System.out.println("car default");
	}
	protected void bike()
	{
		System.out.println("bike protected");
	}
}
