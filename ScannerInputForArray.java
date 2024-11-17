package javaprograms;
//Create an Array of Double data type and take the input from Scanner class

import java.util.Arrays;
import java.util.Scanner;

public class ScannerInputForArray {

	public static void main(String[] args) {
		
		int value [] = new int[2];// declaration of an array
		//value[0] = 12;it is called initialization
		System.out.println("Please enter values");
		Scanner scanner = new Scanner(System.in);
		for(int i= 0; i<value.length; i++){
			value [i] = scanner.nextInt();
		}
		System.out.println("The values for the Array are "+ Arrays.toString(value));
		
		
		scanner.close();

	}

}
