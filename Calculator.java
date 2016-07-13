package com;

public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double array[]={10,20,42,13};
		getSum(array);
	}
public static double getSum(double array[] ){
	
	int i;
	int total=0;
	
	for(i=0;i<array.length;i++){
		total += array[i];
		
	}
	System.out.println("the sum of the array is: \n"+total);
	return total;
}
}
