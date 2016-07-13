package com;

import com.AreaDemo;

class AreaDemo
{
	public static void main(String args[]){
		
		AreaDemo.findArea(5.5);
		AreaDemo.findArea(5.2,6.3);
		AreaDemo.findVolume(4.3);
		AreaDemo.findVolume(4.2,5.5);
	}
	public static double findArea(double Radius){
		
		double pi= 22.0/7;
		double area = pi*Radius*Radius;
		System.out.println("the area of circel is: \n"+area);
		return area;	
	}
	public static double findArea(double Length,double Width){
	
	
		double area = 2 * (Length+Width);
		System.out.println("the area of rectangle is: \n"+area);
		return area;	
	}
	public static double findVolume(double Radius){
		double pi= 22.0/7;
		double volume = (4/3)* pi*Radius*Radius*Radius;
		System.out.println("the volume of sphree is : \n" +volume);
		return volume;	
	}
	public static double findVolume(double Radius,double Height){
		double pi= 22.0/7;
		double volume = (4/3)*pi*Radius*Radius*Height;
		System.out.println("the volume of  cylinder  is : \n"+volume);
		return volume;	
	}
}
	
	
	
	
	







