package javaprograms;
//WAP to find out average of an array of int data type whose size is 3?
public class AvgOfAnArray {

	public static void main(String[] args) {
		
		int value[]  =new int [2];
		value [0] = 12; 
		value [1] = 12;
		
		int output = 0;
		
		for(int i=0; i<value.length; i++) {
			output = output + value[i];
		}
		
		int avg = output/2;
        System.out.println(avg);
   }
    
    
    						
	}
	


