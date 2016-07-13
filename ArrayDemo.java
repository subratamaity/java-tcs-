package com;

public class ArrayDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10,52,14,15,23};
		findAverage(array);
	}
	public static double findAverage(int array[]){
		float average=0;
		int i,sum =0;
		for(i=0;i<array.length;i++){
			sum = sum + array[i];
			
		}
		average =  sum /(array.length);
		System.out.println("the average value of array element is: \n" +average);
		
		return average;
		
		
	}

}
