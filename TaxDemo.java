package com;

public class TaxDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxDemo.calculateNetIncome(20000,5.5);

	}
	public static double calculateNetIncome(double salary,double tax_percentage){
		double netincome1 = 0;
		if(tax_percentage > 0){
		netincome1= salary - salary*tax_percentage;
		System.out.println("net income is:" +netincome1);
	
		}
		return netincome1;
	
	
	}

}
