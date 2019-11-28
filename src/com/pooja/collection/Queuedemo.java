package com.pooja.collection;

import java.util.PriorityQueue;

public class Queuedemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--)
		{
			q.add(i);
		}
		
		// queuw-- 10 9 8 7 6 5 4 3 2 1
		// priorityqueue sorts the data
		// queue- 1 2 3 4 5 6 7 8 9 10
		// peeking -- obtainhead of quue
		// polling - remove the head of q
		
		System.out.println(q);
		System.out.println("get size of queue"+q.size());
		
		System.out.println("head of the queue"+q.peek());
		q.poll();
		q.poll();
		System.out.println("now the size of q after poll"+ q.size());
		;
		
		System.out.println(" Now head of the queu"+ q.peek());
	}
}
