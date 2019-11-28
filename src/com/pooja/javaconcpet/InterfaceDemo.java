package com.pooja.javaconcpet;

// We have 3 interface:
// 1. Normal Interface - multiple method
// 2. Functional Interface - single method
// 3. Marker Interface - no method

interface Manageable{
	
	void sum();
	int BIG=14; //by default static, final
	int SMALL=6;
	 default void sub() // because of default i can specify the body in interface 1.8 feature, final,abstract
	{
		int diff=BIG- SMALL;
		System.out.println(diff);
	}
	 static void mul()
	 {
		 int MUL=BIG*SMALL;
			System.out.println(MUL);
	 }
}

interface ManageableDemo extends Manageable{
	 default void sub() // because of default i can specify the body in interface 1.8 feature, final,abstract
		{
			//int diff=BIG- SMALL;
			System.out.println("In demo show");
		}
}

class ImpInterface implements Manageable,ManageableDemo
{

	public void sum()
	{
		int res=BIG+SMALL;
		System.out.println(res);
	}
	
	//super.sub();
	public void sub()
	{
		ManageableDemo.super.sub();
		int a=5,b=3;
		int diff=a-b;
		System.out.println(diff);
	}
}
public class InterfaceDemo   {
	
	public static void main(String[] args) {
		Manageable m=new ImpInterface();
	m.sub();
		m.sum();
		System.out.println(Manageable.BIG);
		Manageable.mul();
		
		ImpInterface i=new ImpInterface();
		i.sub();
		
	}
	
}
