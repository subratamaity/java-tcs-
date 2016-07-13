package com;

public class EvenDemo {

	 public static void main(String[] args) { 
   

   int array[] = {5,24,56,15,68,51};
   arreven(array);

	}
   public static int[] arreven(int array[]){
   	int i;
   	int j=0;
   	
   	int array1[] = new int[array.length];
   	System.out.println("length is:" +array.length);
   	

   	for (i=0;i<array.length;i++ ) {
   		if(array[i] % 2 == 0){
   			array1[j++] = array[i];
   		}
   	}
   	for (j=0;j<array1.length ;j++ ) {
   		System.out.println("the even no are: \n" +array1[j]);
   			
   		}	
   	 return array1;
		
	}	
}