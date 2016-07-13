package com;

public class Account {

	private int accountid=IdGenaretor.id;
	private int customerid;
	private double balance;
	Account(int a,double b){
		a=customerid;
		b=balance;
		
	}
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccountid() {
		return accountid;
	}
}


