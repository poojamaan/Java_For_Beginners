package com.pooja.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<String>();
		
		// data is in sorted way.
		set.add("john");
		set.add("jennie");
		set.add("pooja");
		set.add("manish");
		set.add("pinkey");
		set.add("mukul");
		
		System.out.println(set);
	}
}
