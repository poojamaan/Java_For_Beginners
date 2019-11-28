package com.pooja.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=null;
		int n=0;
		try {
			br=new BufferedReader(new InputStreamReader(System.in) );
			n=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			br.close();
			System.out.println("Finally executed");
		}
		
		System.out.println(n);
		
		try {
			int num=5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println( "Check divide by zero");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Be in Limit");
		}
		catch(NullPointerException e) {
			System.out.println("INitialize is must");
		}
		catch(Exception e)
		{
			System.err.println("CHeck the error ");
		}
		finally{
			System.out.println(" finally everything sorted");
		}
	}
}
