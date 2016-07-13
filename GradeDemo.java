package com;

public class GradeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeDemo.findgrade(75);

	}
	public static char findgrade(double percent){
		
	char  grade;
	if (percent >0 && percent < 100){
		if(percent >= 80){
			grade = 'A';
		}
		else if(percent >=60 && percent <80)
		{
			grade = 'B';
		}
		else if(percent >=40 && percent <60)
		{
			grade ='D';
		}
		else if(percent >=30 && percent <40)
		{
			grade = 'E';
		}
		else {
			grade= 'F';
		}
	}
	
		else{
			grade = 'O';
	}
	    System.out.println("the grade is : \n" +grade);		
	
    return grade;	
	
	}
}


