package com;

public class PayslipDemo {

	public static void main(String[] args) {
		
		Payslip a1 = new Payslip();
		double a2,a3,a4,a5,a6;
		a2 = a1.calculatBasicsal(60000);
		//System.out.println("vlaue of a1 \n"+a2);
		a3 = a1.calculatPF(a2);
		//System.out.println("vlaue of a3 \n"+a3);
		a4 = a1.calculatHra(a3);
		//System.out.println("vlaue of a4 \n"+a4);
		a5 = a1.calculateTotalsale(a2 ,a4 , 5000.00, 5250.00,400.00, 3000.00 );
		//System.out.println("vlaue of a5 \n"+a5);
		a1.calculateTotalDeduction(a5,a3, 5000.00, 2000.00);
		a6 = a1.calculateAnnualSale(a5);
		a1.calculateAnnualRevisedsale(a6,0.25);	
	}

}
