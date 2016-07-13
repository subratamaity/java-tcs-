package com;

public class Payslip {
	
	public double calculatBasicsal(double grosssal){
		double basicsal;
		basicsal = grosssal * .4;
		System.out.println("basicsal is: \n" +basicsal);
		return basicsal;
		
	}
	public double calculatPF(double basicsal ){
		double pf;
		pf = basicsal * .12;
		System.out.println("pf is: \n" +pf);
		return pf;
	}
		
	
	public double calculatHra(double basicsal){
		double hra;
		hra = basicsal * .5;
		System.out.println("hra is: \n" +hra);
		return hra;
		
	}
	public double calculateTotalsale(double basicsal,double hra,double cityallowance,double sundry,double lta,double performancePay){
		double totalsal;
		totalsal = basicsal + hra + cityallowance +sundry + lta + performancePay;
		System.out.println("totalsal  is: \n" +totalsal);
		return totalsal;
	}
	public double calculateTotalDeduction(double totalsal,double pf,double profTax,double incomeTax ){
		double totaldeduction;
		totaldeduction = pf + profTax + incomeTax;
		System.out.println("totaldeduction  is: \n" +totaldeduction);
		return totaldeduction;
	}
	public double calculateAnnualSale(double totalsal ){
		double anualsal;
		anualsal =  totalsal * .25; 
		System.out.println("anualsal  is: \n" +anualsal);
		
		return anualsal;
	}
	public double calculateAnnualRevisedsale(double anualsal,double percentageHike ){
		double revisedsal;
		revisedsal = anualsal * percentageHike;
		System.out.println("revisedsal  is: \n" +revisedsal);
		return revisedsal;
	}
	
}



