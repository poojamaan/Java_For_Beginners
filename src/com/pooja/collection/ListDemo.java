package com.pooja.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
String name;
	public static void main(String[] args) {
		
	ListDemo s1=new ListDemo();
	s1.name="pooja maan";
	// add as a list ony store objects
	
	ArrayList<String> l1=new ArrayList<String>();
	
	// list 2 can store any type of objects
	
	ArrayList l2=new ArrayList();
	
	l1.add("pooja");
	l1.add("manish");
	l1.add("mukul");
	//l1.add(1);
	
	l2.add("john");
	l2.add(10);
	l2.add(2.2);
	l2.add(s1);
	l2.add("john");
	
	String name=l1.get(2);
	System.out.println("name is "+name);
	
	
	Object o=l2.get(2);
	
System.out.println("o is :"+o);

l1.set(2, "fionna");

System.out.println("list 1 is now "+l1);

l1.remove(2);
System.out.println("list1 is ater remove"+l1);

//l1.clear();

System.out.println(l2);


// contains

if(l1.contains("pooja")) {
	System.out.println("it is in list");
}

// 5. iterate in arrayList

System.out.println("== Iteratinf with for loop");
for(int i=0;i<l1.size();i++)
	System.out.println(l1.get(i));

System.out.println("==========");

System.out.println(" Iterating with enhanced for loop");

for(String s:l1)
	System.out.println(s);

System.out.println("===============");


System.out.println("=== Iterating with iterator====");

Iterator<String> itr =l1.iterator();
//System.out.println(itr.next());
//System.out.println(itr.next());
//System.out.println(itr.next());

while(itr.hasNext())
{
	System.out.println(itr.next());
	if(l1.contains("manish"))
		itr.remove();
}

System.out.println("=====================");

System.out.println("list1 after iteration"+l1);
	
	}
}
