package com.pooja.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<String> set =new HashSet<String>();
		 // Here data is not added as in indexing approach 
		// we got hascodes for elements which are being added
		
		set.add("john");
		set.add("jennie");
		set.add("pooja");
		set.add("manish");
		set.add("pinkey");
		set.add("mukul");
		
		//1. data is unique, no redundancy 
		//2. data is unsorted is outpout due to hashing 
		
		System.out.println("set is"+set);
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		set.remove("pooja");
		System.out.println("now set is "+set);
		
		if(set.contains("manish"))
			System.out.println("he is in set");
			
	}
}
