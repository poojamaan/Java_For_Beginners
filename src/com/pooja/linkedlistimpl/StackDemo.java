package com.pooja.linkedlistimpl;

import java.util.Scanner;

public class StackDemo {
	
	int ar[] =new int[10];
	
	
	static int i=0;

	void push(int num)
	{
		if(i>=ar.length) {
			int new_arr[]=new int[ar.length*2];
			for(int i=0;i<ar.length;i++)
			{
				new_arr[i]=ar[i];
			}
			
			ar=new_arr;
			
		}
		ar[i]=num;
		i++;
	}
	
	int pop()
	{
		if(i<=0)
		{
			System.out.println("you cant delete more element");
			return -1;
		}
		else 
		{
		int temp=ar[--i];
		ar[i]=0;
		
		return temp;
		
		}
	}
	
	public static void main(String[] args) {
		
		StackDemo sd=new StackDemo();
		

		sd.push(10);
		sd.push(20);
		sd.push(30);
		sd.push(40);
		sd.push(50);
		
		sd.push(60);
		
		sd.push(70);
		sd.push(90);
		
		sd.push(110);
		sd.push(320);
		sd.push(140);
		sd.push(3245);
		sd.push(326);
		
	}
}
