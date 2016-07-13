package com;

public class PrimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={13,4,19,85,87,67};
		isPrime(array);
		addPrimeNumbers(array);

	}
	public static int addPrimeNumbers(int array[]){
		
		int sum=0;
		int i,j;
		for(i=0; i<array.length ; i++){
			
			int flag=0;
			for(j=2;j<=array[i]/2;j++){    
				   if(array[i] %j == 0){        
				   flag=1;    
				   break;    
				   }  
			}		   
			if(flag==0){
				sum = sum + array[i];
				
			}	
		}
		System.out.println("the sum of prime no in array is: \n" +sum);
		return sum;
	}


@SuppressWarnings("unused")
public static boolean isPrime(int array[]){
		int i,j;
		for(i=0;i<array.length;i++){
			for(j=2;j<(array[j])/2; j++ ){
				if(array[i] % j !=0)
					return true;
				else 
					return false;
			}
		}	
		return true;
		
	}
}

