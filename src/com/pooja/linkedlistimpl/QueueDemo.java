package com.pooja.linkedlistimpl;

public class QueueDemo {
 
	int[] QArray =new int[10];
	static int front=0;
	static int rear= 0;
	
	int peek()
	{
		return QArray[front];
	}
	
	void insertQ(int num)
	{
		if(rear>=QArray.length)
		{
			int[] qArrayNew=new int[QArray.length*2];
			for(int i=0;i<QArray.length;i++)
			{
				qArrayNew[i]=QArray[i];
			}
			QArray=qArrayNew;
		}
		QArray[rear]=num;
		rear++;
	}
	
	int deleteQ()
	{
		if(front==QArray.length)
		{
			
			System.out.println("No more element to delete");
			return -1;
		}
		else
		{
		int temp=QArray[front];
		QArray[front]=0;
		front++;
		return temp;
		}
	}
	public static void main(String[] args) {
		
		QueueDemo q=new QueueDemo();
		q.insertQ(10);
		q.insertQ(20);
		q.insertQ(30);
		q.insertQ(201);
		q.insertQ(204);
		q.insertQ(203);
		q.insertQ(202);
		
		System.out.println(q.QArray[0]);
		System.out.println(q.deleteQ());
		
		System.out.println(q.deleteQ());

		System.out.println(q.deleteQ());
		System.out.println(q.deleteQ());

		System.out.println(q.deleteQ());


	}
}
