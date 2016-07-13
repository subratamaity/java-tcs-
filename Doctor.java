package com;

public class Doctor {

	int consultingFee;
	String DoctorName;
	double regno;
	String specalization;
	Doctor(int c, String d, String s, double r){
		consultingFee= c;
		DoctorName = d;
		specalization = s;
		regno = r;
	}
	public  String displayDoctorDetail(){
	
		return specalization;
		}
	public int getConsultingFee() {
		return consultingFee;
	}
	public void setConsultingFee(int consultingFee) {
		this.consultingFee = consultingFee;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public double getRegno() {
		return regno;
	}
	public void setRegno(double regno) {
		this.regno = regno;
	}
	public String getSpecalization() {
		return specalization;
	}
	public void setSpecalization(String specalization) {
		this.specalization = specalization;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

