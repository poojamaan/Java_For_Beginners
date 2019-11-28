package com.pooja.javaconcpet;

class Abc
{
	public Abc()
	{
		System.out.println("I am in ABc constructor");
	}
	void show()
	{
		System.out.println(" I am in SHOw A");
	}
}

class Bc extends Abc
{
	public Bc()
	{
		
		System.out.println("i m in bc constructor");
		
	}
	void show()
	{
		
		System.out.println(" I am in show B");
	//	super.show();
	}
}
public class SuperDemo {

	 public static void main(String[] args) {
		
		 Abc bc=new Bc();
		 
		 bc.show();
	}
}
