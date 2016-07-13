package com;

public class Calculator1 {
	
	public static int add(int a,int b){
		int c;
		c = a+b;
		
		return c;
		
	}
	public static int subtract(int a,int b){
		
		int c;
		if(a>b)
			c = a-b;
		else
			c=b-a;
		
		return c;
	}
	public static int multiply(int a,int b){
		
		int c;
		c = a*b;
		
		return c;
	}
	public static int divide(int a,int b){
		
		int c;
		if(a>b && b!=0)
			c = a/b;
		else
			c=b/a;
		
		return c;
	}

}
