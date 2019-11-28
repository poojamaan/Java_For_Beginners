package com.pooja.javaconcpet;
 // if you over ride a class only for single method, then no need to create a new class gove the defination as anonymous


class A
{
	void show()
	{
		System.out.println("I am in show");
	}
}

// upto now only A class now i dont want to edit in previos class but want change in method so, we will create a new method show in new class

class B extends A
{
	
	void show()
	{
		System.out.println("I am the best");
	}
}


public class AnonymousDemo {

	public static void main(String[] args) {
		A a=new A();
		a.show();
		
		// now showing overriding here
		
		A b=new B();
		b.show();
		
		// if you want to use one time class then preferely go to anynomous class
		A c= new A() {
			void show()
			{
				System.out.println("Hello i am in anonymous class");
			}
		};
		c.show();
	}
}
