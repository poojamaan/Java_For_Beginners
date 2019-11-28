package com.pooja.multithreadingDemo;

class Counter
{
	int count;
	public void increment()
	{
		
		  count++; // count =count+1 sometime facing an issue like storing problem. if we call count 1000 times it will not show exactly value lets do with thread
		
	}
}

class  Counter1
{
	int count;
	public synchronized void increment()
	{
		count++; // here we are trying to count with thread which is not giving exactly value, because counting is not completing and again thread came for increament.
	}
}
public class SyncDemo {
 public static void main(String[] args) throws InterruptedException {
	
	 Counter c=new Counter();
	 
//	 c.increment();
//	 c.increment();
	 

Thread t1=new Thread(new Runnable()
{
public void run()
{
for(int i =0;i<1000;i++)
{
	 c.increment();
}
}
});
t1.start(); // upto here we can see the count value come zero

t1.join(); // after this value come exactly what we wanthat is 1000 t. We also need to throws the exception in 

 // now add one more thread and check after join we get exact value what we want. But if we declare a thread continoulsy we didn't get what we want. like see with t2 and t3


Thread t2=new Thread(new Runnable()
{
public void run()
{
for(int i =0;i<1000;i++)
{
	 c.increment();
}
}

});

Thread t3 = new Thread(new Runnable () {
	public void run()
	{
		for(int i=0;i<1000;i++)
			
		c.increment();
		
	}
});

t2.start(); // only t2 will give exact output,  but after add t3 its not giving o/p we want. becayse of concurrent thread
t3.start();
t2.join();t3.join(); // No, right now we need to add synchonized keyword until one thread complete thier jobs next will not start.


System.out.println(c.count); 

}
	
}
